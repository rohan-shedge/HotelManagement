package com.mahabaleshwar;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import com.google.common.base.Optional;
import com.google.common.reflect.Invokable;
import com.mahabaleshwar.FeatureSwitch.FeatureSwitch;

/**
 * Created by tomcat on 2/24/17.
 */
public class FeatureSwitchActivationInvokedMethodListener implements IInvokedMethodListener {

    private Map<FeatureSwitch, Boolean> currentValues;

    private static FeatureSwitchActivation getAnnotation(IInvokedMethod method) {
        if(method.isTestMethod()) {
            return Optional.fromNullable(Invokable.from(method.getTestMethod().getConstructorOrMethod().getMethod()).
                    getAnnotation(FeatureSwitchActivation.class)).
                    or(Optional.fromNullable((FeatureSwitchActivation)method.getTestMethod().getTestClass().
                            getRealClass().getAnnotation(FeatureSwitchActivation.class))).orNull();
        }
        return null;
    }

    private static boolean isAnnotationPresent(IInvokedMethod method) {
        return getAnnotation(method) != null;
    }

    
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        final FeatureSwitchActivation activation = getAnnotation(method);
        if(activation != null && ArrayUtils.isNotEmpty(activation.value())) {
            currentValues = new HashMap<FeatureSwitch, Boolean>();
            for(FeatureSwitch fs : activation.value()) {
                currentValues.put(fs, fs.isActivated());
                fs.setActivated(activation.activated());
            }
        }
    }

    
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if(isAnnotationPresent(method)) {
            if(currentValues != null) {
                for(Map.Entry<FeatureSwitch, Boolean> fs : currentValues.entrySet()) {
                    fs.getKey().setActivated(fs.getValue());
                }
            }
        }
    }
}

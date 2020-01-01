package com.mahabaleshwar;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.mahabaleshwar.FeatureSwitch.FeatureSwitch;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface FeatureSwitchActivation {
	
	FeatureSwitch[] value();
	boolean activated() default true;
}

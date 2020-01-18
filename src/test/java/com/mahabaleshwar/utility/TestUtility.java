package com.mahabaleshwar.utility;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mahabaleshwar.FeatureSwitchActivation;
import com.mahabaleshwar.FeatureSwitchActivationInvokedMethodListener;
import com.mahabaleshwar.FeatureSwitch.FeatureSwitch;
import com.mahabaleshwar.util.Utility;

@Test
@Listeners(FeatureSwitchActivationInvokedMethodListener.class)
public class TestUtility {
	
	@DataProvider
	private static Object[][] testDataConnectors() {
		return new Object[][]
				{
						{"Rohan Shedge", "Rohan Shedge"},
						{"Rohan Shedge", "Rohan Shedge"}
				};
	}
	
	@Test(dataProvider = "testDataConnectors")
	@FeatureSwitchActivation(FeatureSwitch.DATABASECONNECTIVITY)
	public void testOwnersName(String expected, String actuals) {
		System.out.print("TESTING FS \n");
		assertEquals("Rohan Shedge",Utility.getOwnerName());
		assertEquals(expected, actuals);
	}

}

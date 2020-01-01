package com.mahabaleshwar;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mahabaleshwar.FeatureSwitch.FeatureSwitch;

@Test
@Listeners(FeatureSwitchActivationInvokedMethodListener.class)
public class TestProject {

public TestProject() {
    System.out.println("Created a MyTest");
  }

  @BeforeClass
  public void setup() {
	  System.out.println("setup  " + FeatureSwitch.DATABASECONNECTIVITY.isActivated());
  }


  @AfterClass
  public void teardown() {
	  System.out.println("teardown  " + FeatureSwitch.DATABASECONNECTIVITY.isActivated());
  }

  
  @Test
  @FeatureSwitchActivation(FeatureSwitch.DATABASECONNECTIVITY)
  public void testA() {
	  System.out.println(" testA " + FeatureSwitch.DATABASECONNECTIVITY.isActivated());
	  assertEquals("abc", "abc");
  }

  @Test
  @FeatureSwitchActivation(FeatureSwitch.DATABASECONNECTIVITY)
  public void testB() {
	  assertEquals("abc", "abc");
  }
}
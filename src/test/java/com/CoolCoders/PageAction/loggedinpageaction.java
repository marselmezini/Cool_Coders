package com.CoolCoders.PageAction;

import org.testng.Assert;

import com.CoolCoders.PageLocator.loggedinpagelocators;

import Utility.BaseClass;

public class loggedinpageaction extends BaseClass{

	loggedinpagelocators LoggedinPageLocators=new loggedinpagelocators();
	
	public  void verifyuserisloggedin() throws Exception {
		Thread.sleep(2000);
		boolean verify=LoggedinPageLocators.wellcomelink.isDisplayed();
		Assert.assertTrue(verify);
	}
}

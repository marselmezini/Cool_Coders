package com.CoolCoders.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class loggedinpagelocators extends BaseClass {

	
	public loggedinpagelocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy
	(id = "nameofuser")
	public static WebElement wellcomelink;
}

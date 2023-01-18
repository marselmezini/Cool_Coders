package com.CoolCoders.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class productspagelocator extends BaseClass{

	public productspagelocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy
	(xpath = "//td[text()='Samsung galaxy s7']")
	public static WebElement samsungitem;
	@FindBy
	(linkText = "Add to cart")
	public static WebElement addtocartbutton;
}

package com.CoolCoders.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class cartpagelocator extends BaseClass{

	
	
	public cartpagelocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy
	(css = "[onclick=\"addToCart(4)\"]")
	public static WebElement addtocart;
	@FindBy
	(xpath = "//td[text()='Samsung galaxy s7']")
	public static WebElement samsungitem;
}

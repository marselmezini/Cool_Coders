package com.CoolCoders.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class homepagelocators extends BaseClass{

	
	public homepagelocators() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy
	(xpath = "//a[text()='Home ']")
	public static WebElement homebutton;
	@FindBy
	(id = "cartur")
	public static WebElement cartbutton;
	@FindBy
	(xpath = "//a[text()='Contact']")
	public static WebElement contactbutton;
	@FindBy
	(css = "#exampleModal > div > div > div.modal-body")
	public static WebElement newmessagewindow;
	
	@FindBy
	(id = "login2")
	public static WebElement loginbutton;
	@FindBy
	(id = "loginusername")
	public static WebElement username;
	@FindBy
	(id = "loginpassword")
	public static WebElement password;
	@FindBy
	(css = "[onclick=\"logIn()\"]")
	public static WebElement login;
	
	@FindBy
	(xpath = "//a[text()='Samsung galaxy s7']")
	public static WebElement clickitem;
	
	
	
	
	
	
	
	
	
	
	
	
	
}

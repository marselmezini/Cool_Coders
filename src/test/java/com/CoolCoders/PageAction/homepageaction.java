package com.CoolCoders.PageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.CoolCoders.PageLocator.homepagelocators;

import Utility.BaseClass;

public class homepageaction extends BaseClass{
     
	homepagelocators HomePageLocators=new homepagelocators();
	
	public void Verifyhomelinkisdisplayed() throws Exception {
		Thread.sleep(5000);
	boolean verify=	driver.findElement(By.xpath("//a[text()='Home ']")).isDisplayed();
	Assert.assertTrue(verify);
	}
	
	public void Verifycartisdisplayed() throws Exception {
		
		Thread.sleep(5000);
		boolean  verify=driver.findElement(By.id("cartur")).isDisplayed();
		Assert.assertTrue(verify);
	}
	public void Clickcontactbutton() throws Exception {
		Thread.sleep(5000);
		HomePageLocators.contactbutton.click();
	}
	public void Verifynewmessagewindowisdisplayed() throws Exception {
		Thread.sleep(5000);
		boolean verify=driver.findElement(By.cssSelector("#exampleModal > div > div > div.modal-body")).isDisplayed();
		Assert.assertTrue(verify);
	}
		public void Clickloginbutton() throws Exception {
			
			HomePageLocators.loginbutton.click();
			Thread.sleep(5000);
		}
		public void usertypecredentialsUsernamePasswordandclicklogin(String u,String p) throws Exception {
			Thread.sleep(5000);
			HomePageLocators.username.sendKeys(loadfile.getProperty("username"));
			Thread.sleep(5000);
			HomePageLocators.password.sendKeys(loadfile.getProperty("password"));
			Thread.sleep(5000);
			HomePageLocators.login.click();
			
		}
		public void ClickSamsungGalaxyS7() throws Exception {
			((JavascriptExecutor)driver).executeScript("scroll,0,400");
			Thread.sleep(5000);
			HomePageLocators.clickitem.click();
		}
		public void Clickcart() throws InterruptedException {
			Thread.sleep(5000);
			HomePageLocators.cartbutton.click();
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


package com.CoolCoders.PageAction;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.CoolCoders.PageLocator.cartpagelocator;

import Utility.BaseClass;

public class cartpageaction extends BaseClass{

	
	cartpagelocator CartPageLocator=new cartpagelocator();
	
	public void Verifyitemisincart() throws Exception {
		Thread.sleep(3000);
		boolean verify=driver.findElement(By.xpath("//td[text()='Samsung galaxy s7']")).isDisplayed();
		Assert.assertTrue(verify);
	}
}

package com.CoolCoders.PageAction;

import com.CoolCoders.PageLocator.productspagelocator;

import Utility.BaseClass;

public class productspageaction extends BaseClass{

	
	productspagelocator ProductsPageLocator=new productspagelocator();
	
	public void Additemincart() throws Exception {
		
		ProductsPageLocator.addtocartbutton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}

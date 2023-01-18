package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static Properties loadfile;
	public static WebDriver driver;
	
	public BaseClass()  {
		
		try {
			FileInputStream files=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\CoolCoders\\config\\CodersConfig.properties" );
		    loadfile=new Properties();
			loadfile.load(files);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void browserinitialize() {
		
	String	bro=loadfile.getProperty("Browser1");
	
	if(bro.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver - Copy.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(testdataclass.implicitywait));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(testdataclass.pageloadout));
		
	}
	else if (bro.equalsIgnoreCase("Edge")) {
		
	}
	}
	
	public void launchwebsite(String URL) {
		
		driver.get(loadfile.getProperty("Url"));
	}
}

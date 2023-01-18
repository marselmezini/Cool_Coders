package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilityclass extends BaseClass{

	
	public static void takeMyScreenShot(WebDriver driver,String SCREENSHOTS) {
		
		File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    
		           String     correntdir =   System.getProperty("user.dir");
			
			try {
				FileUtils.copyFile(scrfile, new File(correntdir+"/Screenshots/"+SCREENSHOTS+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
}

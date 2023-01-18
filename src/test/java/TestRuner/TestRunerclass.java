package TestRuner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions
(features= {"src/test/resources/Features"},
glue= {"Stepdefinition"},
plugin= {"json:target/cucumber.json"})//,tags= {"@item"})
public class TestRunerclass extends AbstractTestNGCucumberTests{
	
	
		
		@BeforeTest
		public void setup() {
			BaseClass base=new BaseClass();
			base.browserinitialize();
		}
		@AfterTest
		
		public void closeurl() {
			BaseClass base=new BaseClass();
			base.driver.quit();
			
		}
}

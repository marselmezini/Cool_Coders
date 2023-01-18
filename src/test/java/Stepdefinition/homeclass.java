package Stepdefinition;

import com.CoolCoders.PageAction.cartpageaction;
import com.CoolCoders.PageAction.homepageaction;
import com.CoolCoders.PageAction.loggedinpageaction;
import com.CoolCoders.PageAction.productspageaction;

import Utility.BaseClass;
import Utility.utilityclass;
import cucumber.api.java.en.*;

public class homeclass extends BaseClass {

	homepageaction HomePageAction=new homepageaction();
	loggedinpageaction LoggedinPageAction=new loggedinpageaction();
	cartpageaction CartPageAction=new cartpageaction();
	productspageaction ProductsPageAction=new productspageaction();
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    launchwebsite(URL);
	}
	@Then("^Verify home link is displayed$")
	public void verify_home_link_is_displayed() throws Throwable {
	    HomePageAction.Verifyhomelinkisdisplayed();
	    utilityclass.takeMyScreenShot(driver, "homebutton");
	}
	@Then("^Verify  cart is displayed$")
	public void verify_cart_is_displayed() throws Throwable {
	    HomePageAction.Verifycartisdisplayed();
	    utilityclass.takeMyScreenShot(driver, "cartbutton");
	}

    @Then("^Click contact button$")
    public void click_contact_button() throws Throwable {
    HomePageAction.Clickcontactbutton();
}

    @Then("^Verify new message window is displayed$")
     public void verify_new_message_window_is_displayed() throws Throwable {
    HomePageAction.Verifynewmessagewindowisdisplayed();
    utilityclass.takeMyScreenShot(driver, "newmessagewindow");
}
     

    @Then("^Click login button$")
     public void click_login_button() throws Throwable {
    HomePageAction.Clickloginbutton();
}

    @Then("^User type credentials \"([^\"]*)\" \"([^\"]*)\" and click login$")
    public void user_type_credentials_and_click_login(String u, String p) throws Throwable {
    HomePageAction.usertypecredentialsUsernamePasswordandclicklogin(u, p);
}

    @Then("^Verify user is logged in$")
    public void verify_user_is_logged_in() throws Throwable {
    LoggedinPageAction.verifyuserisloggedin();
    utilityclass.takeMyScreenShot(driver, "wellcomelink");
}
    @Then("^Click Samsung Galaxy S(\\d+)$")
    public void click_Samsung_Galaxy_S(int arg1) throws Throwable {
        HomePageAction.ClickSamsungGalaxyS7();
    }

    @Then("^Add item in cart$")
    public void add_item_in_cart() throws Throwable {
       ProductsPageAction.Additemincart();
    }

    @Then("^Click cart$")
    public void click_cart() throws Throwable {
        HomePageAction.Clickcart();
    }

    @Then("^Verify item is in cart$")
    public void verify_item_is_in_cart() throws Throwable {
        CartPageAction.Verifyitemisincart();
        utilityclass.takeMyScreenShot(driver, "samsungitem");
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

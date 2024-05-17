package stepdefination;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyaccountPage;
import utilities.DataReader;

public class LoginSteps {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	MyaccountPage myap;
	//List<HashMap<String,String>>datamap;
	@Given("the user navigates to login page")
	public void the_user_navigates_to_login_page() {
		BaseClass.getLogger().info("Go to MyAccount .......");
		hp=new HomePage(BaseClass.getDriver());
		hp.account();
		//hp.register();
		hp.logi();
	}	
	@When("user enter email as {string} and password as {string}")
	public void user_enter_emails_as_and_password_as(String email, String password) {
		BaseClass.getLogger().info("Entering Email and password .......");
	    lp=new LoginPage(BaseClass.getDriver());
	    lp.setmail(email);
	    lp.setpass(password);
	}

	@When("the user click on the Login button")
	public void the_user_click_on_the_login_button() {
	    lp.btnlog();
	    BaseClass.getLogger().info("clicked on login button");
	}

	@Then("the user should be redirected to the MyAccount page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
		myap=new MyaccountPage(BaseClass.getDriver());
		boolean status=myap.myaccountexists();
	  Assert.assertEquals(status,true);
	}
	//
	//***************Data Driven Test******************
	

	/*@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		BaseClass.getLogger().info("Go to MyAccount .......");
		hp=new HomePage(BaseClass.getDriver());
		hp.account();
		//hp.register();
		hp.logi();
		
				
	   
	}



	
	@Then("the user should be navigates to MyAccountPage  by passing email and password with excel row {string}")
	public void the_user_should_be_navigates_to_my_account_page_by_passing_email_and_password_with_excel_row(String rows) {
		datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\teatdataddt.xls", "Sheet1");
		int index=Integer.parseInt(rows)-1;
		String email=datamap.get(index).get("Username");
		String pass=datamap.get(index).get("Password");
		String res=datamap.get(index).get("Result");
		lp=new LoginPage(BaseClass.getDriver());
		lp.setmail(email);
		lp.setpass(pass);
		lp.btnlog();
		myap=new MyaccountPage(BaseClass.getDriver());
		try {
			boolean status=myap.myaccountexists();
			System.out.println("page is :"+status);
			if(res.equals("valid")) {
				if(status==true) {
					myap=new MyaccountPage(BaseClass.getDriver());
					myap.lgout();
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
			}
			if(res.equals("invalid")) {
				if(status==true) {
					myap.lgout();
					Assert.assertTrue(false);
				}
				else {
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e) {
			Assert.assertTrue(false);
		}
		
		
	}*/

	    
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




package testcases;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Homepage;
import pageObjects.RegisterAccountPage;
import testBase.BaseClass;


// Parentclass BaseClass 
//Childclass:TC001_AccountRegistration
public class TC001_AccountRegistration extends BaseClass

{
 
 
 
 @Test(priority=1)
 public void TC001_Registration()
 {
	
	 Homepage objHP=new Homepage(driver); //Constructor assigns testcase driver parameter to pageobject class driver
	 objHP.click_MyAcc();
	 objHP.click_Register();
	 
	 RegisterAccountPage objRegister=new RegisterAccountPage(driver);
	 objRegister.set_firstname("abctest");
	 objRegister.set_lastname("xyztest");
	 objRegister.set_email(randomalphabet()+"test@gmail.com");
	 objRegister.set_phone("11112334");
	 objRegister.set_password("testing");
	 objRegister.set_confirmpwd("testing");
	 objRegister.click_privacy();
	 objRegister.click_continue();
	 
	 String expectedmsg="Your Account Has Been Created!";
	 if(objRegister.confirm_msg().equals(expectedmsg))
	 {
	   Assert.assertTrue(true);
	 
	 }
	 else
	 {
		 Assert.assertFalse(false);
	 }

 }
 
}

 


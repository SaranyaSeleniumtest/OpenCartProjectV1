package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{

	//step1: webdriver instance
	
	WebDriver driver;
	
	//step2: create constructor for homepage class
		/*constructor doesnt return any value. No need of void statement
		constructor doesnt have actions
		It is used to assign values to variables
		It may have arguments
		name of constructor should be same as class name */
		
	public Homepage(WebDriver driver) // Parameterized Constructor.This driver parameter is of return type WebDriver and should get value while creating object of homepage class from test case
	{
		this.driver=driver; //Here driver parameter which got from testcase is assigned to local class variable driver using this keyword
		PageFactory.initElements(driver,this);
	}
	
	//step3: create page objects using page factory
	//Locators
	
	@FindBy(xpath="//a[@title='My Account']") 
	WebElement img_account;
	
	@FindBy(linkText="Register")
	WebElement lnk_Register;
	
	//Add action methods for respective locators
	public void click_MyAcc()
	{
		img_account.click();
	}
	
	
	public void click_Register()
	{
		lnk_Register.click();
	}
	
	
	
	public void click_Login()
	{
		img_account.click();
	}
	
	
}

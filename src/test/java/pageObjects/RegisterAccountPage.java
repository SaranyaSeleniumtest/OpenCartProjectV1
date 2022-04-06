package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage

{
	WebDriver driver;
	
	//constructor
	public RegisterAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locators
	@FindBy(id="input-firstname")
	WebElement txt_Firstname;
	
	@FindBy(id="input-lastname")
	WebElement txt_lastname;
	
	@FindBy(id="input-email")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement txt_telephone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_pwd;
	
	@FindBy(id="input-confirm")
	WebElement txt_pwdconfirm;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chk_privacy;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement btn_continue;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement msg_confirmation;
	//actionmethods
	
	public void set_firstname(String fname)
	{
		txt_Firstname.sendKeys(fname);
	}
	
	public void set_lastname(String lname)
	{
		txt_lastname.sendKeys(lname);
	}
	
	public void set_email(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void set_phone(String phone)
	{
		txt_telephone.sendKeys(phone);
	}
	
	public void set_password(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	
	public void set_confirmpwd(String confirmpwd)
	{
		txt_pwdconfirm.sendKeys(confirmpwd);
	}
	
	public void click_privacy()
	{
		chk_privacy.click();
	}
	
	public void click_continue()
	{
		btn_continue.click();
	}
	
	public String confirm_msg()
	{
		String actualtext=msg_confirmation.getText();
		return actualtext;
	}
	
	
}

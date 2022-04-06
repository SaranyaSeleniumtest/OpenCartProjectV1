package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public ResourceBundle rb; 
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br)
	 {
		//Load Properties file
		
		rb=ResourceBundle.getBundle("config");
		
		//Driver setup
		if (br.equals("chrome"))
		{
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		 driver.get(rb.getString("url"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	
	
	public String randomalphabet()
	{
		String  generatedalphabet=RandomStringUtils.randomAlphabetic(6);
		return generatedalphabet;
	}
	
	 public void teardown()
	 {
		 driver.quit();
	 }
	
}

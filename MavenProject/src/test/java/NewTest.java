import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/hanumanjeeshivam/HANUMANJEESHIVAM/automationTest/Users/hanumanjeeshivam/mygitprojects/chromedriver");
		this.driver= new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
  @Test
  public void f() {
	  driver.get("https://www.softwaretestingmaterial.com/");
	  
	  System.out.println("Tsting");
  }
  
  @AfterMethod
  public void tearDown() {
	  if(this.driver !=null) {
		  this.driver.quit();
		  
	  }
	  
  }
}

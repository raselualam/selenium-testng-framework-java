package model;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModelPage extends ModelBase {

	public HomePageModelPage(WebDriver driver) {
		super(driver);                      // Auto from extends
	}
  
	protected WebElement myUps = null;
	protected WebElement profile = null;
	protected WebElement shipping = null;
	protected WebElement tracking = null;
	protected WebElement userId = null;
	protected WebElement userPassword = null;
	protected WebElement logIn = null;
	
	//Fix Xpath as //a[contains(text(),'The UPS Store')]
	
	
	public WebElement myUps() {
		myUps = driver.findElement(By.xpath("//a[@id='navImg0']"));
		return myUps;
	}
	
	public WebElement profile() {
		profile = driver.findElement(By.xpath("//a[@href='https://www.ups.com/myups/profile?loc=en_US&WT.svl=PNRO_L1']"));
		return profile;
	}
	
	public WebElement shipping() {
		shipping = driver.findElement(By.xpath("//*[@id='navImg1']"));
		return shipping;
	}
	
	public WebElement tracking() {
		tracking = driver.findElement(By.xpath("//*[@id='navImg2']"));
		return tracking;
	}
		
	public WebElement userId() {
		userId = driver.findElement(By.xpath("//input[@name='uid']"));
		return userId;
	}
	
	public WebElement userPassword() {
		userPassword = driver.findElement(By.xpath("//input[@name='password']"));
		return userPassword;
	}
	
	public WebElement logIn() {
		logIn = driver.findElement(By.xpath("//input[@name='next']"));
		return logIn;
	}
	
}
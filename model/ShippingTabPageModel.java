package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingTabPageModel extends ModelBase {

	public ShippingTabPageModel(WebDriver driver) {
		super(driver);                        // Auto from extends
	}

	protected WebElement usernameLabel = null;
	protected WebElement hoberShipping = null;
	protected WebElement createShipping = null;
	protected WebElement createReturn = null;
	protected WebElement calculateTimeCost = null;
	protected WebElement schedulePickup = null;
	
		
	public WebElement usernameLabel() {
		WebElement usernameLabel = driver.findElement(By.xpath("//*[@id='usbLoggedIn']/div/dl/dt/label"));
		return usernameLabel;
	}
	
	public WebElement hoberShipping() {
		WebElement hoberShipping = driver.findElement(By.xpath("//*[@id='navImg1']"));
		return hoberShipping;
	}
	
	public WebElement createShipping() {
		WebElement createShipping = driver.findElement(By.xpath("//*[@id='ccpnmenu1']/a[1]"));
		return createShipping;
	}
	
	public WebElement createReturn() {
		WebElement createReturn = driver.findElement(By.xpath("//*[@id='ccpnmenu1']/a[4]"));
		return createReturn;
	}
	
	public WebElement calculateTimeCost() {
		WebElement calculateTimeCost = driver.findElement(By.xpath("//*[@id='ccpnmenu1']/a[8]"));
		return calculateTimeCost;
	}
	
	public WebElement schedulePickup() {
		WebElement schedulePickup = driver.findElement(By.xpath("//*[@id='ccpnmenu1']/a[9]"));
		return schedulePickup;
	}
	
}

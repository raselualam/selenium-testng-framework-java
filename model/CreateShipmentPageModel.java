package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateShipmentPageModel extends ModelBase {

	public CreateShipmentPageModel(WebDriver driver) {
		super(driver);         // Auto for extends
	}

protected WebElement toCompanyName = null;
protected WebElement toContact = null;
protected WebElement toAddress = null;
protected WebElement toCity = null;
protected WebElement toState = null;
protected WebElement toZipcode = null;
protected WebElement toTelephone = null;
protected WebElement numberPackage = null;
protected WebElement packagingType = null;
protected WebElement packageUSD = null;
protected WebElement reviewDetails = null;
protected WebElement btnNext = null;
	
	public WebElement toCompanyName() {
		WebElement toCompanyName = driver.findElement(By.xpath("//*[@id='shipToNameValue']"));
		return toCompanyName;
	}
	
	public WebElement toContact() {
		WebElement toContact = driver.findElement(By.xpath("//*[@id='shipToContactNameValue']"));
		return toContact;
	}
	
	public WebElement toAddress() {
		WebElement toAddress = driver.findElement(By.xpath("//*[@id='shipToStreetValue']"));
		return toAddress;
	}
	
		public WebElement toCity() {
		WebElement toCity = driver.findElement(By.xpath("//*[@id='shipToCityValue']"));
		return toCity;
	}
	
	public WebElement toState() {
		WebElement toState = driver.findElement(By.xpath("//*[@id='shipToStateValue']"));
		return toState;
	}
	
	public WebElement toZipcode() {
		WebElement toZipcode = driver.findElement(By.xpath("//*[@id='shipToPostalValue']"));
		return toZipcode;
	}
		
	public WebElement toTelephone() {
		WebElement toTelephone = driver.findElement(By.xpath("//*[@id='shipToPhoneValue']"));
		return toTelephone;
	}
	
	public WebElement numberPackage() {
		WebElement numberPackage = driver.findElement(By.xpath("//*[@id='packageCount']"));
		return numberPackage;
	}
	
	public WebElement packagingType() {
		WebElement packagingType = driver.findElement(By.xpath("//*[@id='packagingType']"));
		return packagingType;
	}
	
	public WebElement packageUSD() {
		WebElement packageUSD = driver.findElement(By.xpath("//*[@id='packageBean_insuredAmount']"));
		return packageUSD;
	}
	
	public WebElement reviewDetails() {
		WebElement reviewDetails = driver.findElement(By.xpath("//*[@id='reviewDetails']"));
		return reviewDetails;
	}
	
	public WebElement btnNext() {
		WebElement btnNext = driver.findElement(By.xpath("//*[@id='next']"));
		return btnNext;
	}
}

package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateReturnPageModel extends ModelBase {

	public CreateReturnPageModel(WebDriver driver) {
		super(driver);                                      // Auto
	}

	protected WebElement returnAddressBook = null;
	protected WebElement returnFromCompanyName = null;
	protected WebElement returnFromContact = null;
	protected WebElement returnFromAddress = null;
	protected WebElement returnFromCity = null;
	protected WebElement returnFromState = null;
	protected WebElement returnFromZipcode = null;
	protected WebElement returnFromTelephone = null;
	protected WebElement returnPackagingType = null;
	protected WebElement returnPackageUSD = null;
	protected WebElement returnMechandiseDescription = null;
	protected WebElement returnReviewDetails = null;
	protected WebElement returnBtnNext = null;
		
		public WebElement returnAddressBook() {
			WebElement returnAddressBook = driver.findElement(By.xpath("//*[@id='select_shipFrom']"));
			return returnAddressBook;
		}
	
		public WebElement returnFromCompanyName() {
			WebElement returnFromCompanyName = driver.findElement(By.xpath("//*[@id='returnFromNameValue']"));
			return returnFromCompanyName;
		}
		
		public WebElement returnFromContact() {
			WebElement returnFromContact = driver.findElement(By.xpath("//*[@id='returnFromContactNameValue']"));
			return returnFromContact;
		}
		
		public WebElement returnFromAddress() {
			WebElement returnFromAddress = driver.findElement(By.xpath("//*[@id='returnFromStreetValue']"));
			return returnFromAddress;
		}
		
			public WebElement returnFromCity() {
			WebElement returnFromCity = driver.findElement(By.xpath("//*[@id='returnFromCityValue']"));
			return returnFromCity;
		}
		
		public WebElement returnFromState() {
			WebElement returnFromState = driver.findElement(By.xpath("//*[@id='returnFromStateValue']"));
			return returnFromState;
		}
		
		public WebElement returnFromZipcode() {
			WebElement returnFromZipcode = driver.findElement(By.xpath("//*[@id='returnFromPostalValue']"));
			return returnFromZipcode;
		}
			
		public WebElement returnFromTelephone() {
			WebElement returnFromTelephone = driver.findElement(By.xpath("//*[@id='returnFromPhoneValue']"));
			return returnFromTelephone;
		}
		
		
		public WebElement returnPackagingType() {
			WebElement returnPackagingType = driver.findElement(By.xpath("//*[@id='packagingType']"));
			return returnPackagingType;
		}
		
		public WebElement returnPackageUSD() {
			WebElement returnPackageUSD = driver.findElement(By.xpath("//*[@id='packageBean_insuredAmount']"));
			return returnPackageUSD;
		}
		
		public WebElement returnMechandiseDescription() {
			WebElement returnMechandiseDescription = driver.findElement(By.xpath("//*[@id='packageBean_merchandiseDescription']"));
			return returnMechandiseDescription;
		}
		
		public WebElement returnReviewDetails() {
			WebElement returnReviewDetails = driver.findElement(By.xpath("//*[@id='reviewDetails']"));
			return returnReviewDetails;
		}
		
		public WebElement returnBtnNext() {
			WebElement returnBtnNext = driver.findElement(By.xpath("//*[@id='next']"));
			return returnBtnNext;
		}
	
}

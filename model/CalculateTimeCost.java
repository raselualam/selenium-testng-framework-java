package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculateTimeCost extends ModelBase{

	public CalculateTimeCost(WebDriver driver) {
		super(driver);						// TODO Auto-generated constructor stub
	}
 
	protected WebElement CalculateFromAddress = null;
	protected WebElement CalculateFromCountry = null;
	protected WebElement CalculateFromCity = null;
	protected WebElement CalculateFromZip = null;
	protected WebElement CalculateFromResidential = null;
	protected WebElement CalculateToContacts = null;
	protected WebElement CalculateToCountry = null;
	protected WebElement CalculateToCity = null;
	protected WebElement CalculateToZip = null;
	protected WebElement CalculateDestinationType = null;
	protected WebElement CalculateBtnCalender = null;
	protected WebElement CalculateSelectDate = null;
	protected WebElement CalculateBtnUpdate = null;
		
		public WebElement CalculateFromAddress() {
			WebElement CalculateFromAddress = driver.findElement(By.xpath("//*[@id='module1edit']/div[1]/div[5]/div/dl/dd[1]/select"));
			return CalculateFromAddress;
		}
	
		public WebElement CalculateFromCountry() {
			WebElement CalculateFromCountry = driver.findElement(By.xpath("//*[@id='origCountryValue']"));
			return CalculateFromCountry;
		}
		
		public WebElement CalculateFromCity() {
			WebElement CalculateFromCity = driver.findElement(By.xpath("//*[@id='origCityValue']"));
			return CalculateFromCity;
		}
		
		public WebElement CalculateFromZip() {
			WebElement CalculateFromZip = driver.findElement(By.xpath("//*[@id='origPostalValue']"));
			return CalculateFromZip;
		}
		
			public WebElement CalculateFromResidential() {
			WebElement CalculateFromResidential = driver.findElement(By.xpath("//*[@id='orckBox']"));
			return CalculateFromResidential;
		}
		
		public WebElement CalculateToContacts() {
			WebElement CalculateToContacts = driver.findElement(By.xpath("//*[@id='module1edit']/div[3]/div[2]/div[1]/dl/dd[1]/select"));
			return CalculateToContacts;
		}
		
		public WebElement CalculateToCountry() {
			WebElement CalculateToCountry = driver.findElement(By.xpath("//*[@id='destCountryValue']"));
			return CalculateToCountry;
		}
			
		public WebElement CalculateToCity() {
			WebElement CalculateToCity = driver.findElement(By.xpath("//*[@id='destCityValue']"));
			return CalculateToCity;
		}
		
		
		public WebElement CalculateToZip() {
			WebElement CalculateToZip = driver.findElement(By.xpath("//*[@id='destPostalValue']"));
			return CalculateToZip;
		}
		
		public WebElement CalculateDestinationType() {
			WebElement CalculateDestinationType = driver.findElement(By.xpath("//*[@id='dRadio']"));
			return CalculateDestinationType;
		}
		
		public WebElement CalculateBtnCalender() {
			WebElement CalculateBtnCalender = driver.findElement(By.xpath("//*[@id='ship_picker_id']/img"));
			return CalculateBtnCalender;
		}
		
		public WebElement CalculateSelectDate() {
			WebElement CalculateSelectDate = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a"));
			return CalculateSelectDate;
		}
		
		public WebElement CalculateBtnUpdate() {
			WebElement CalculateBtnUpdate = driver.findElement(By.xpath("//*[@id='ctc_module1_submit']"));
			return CalculateBtnUpdate;
		}
	
	
}

package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SchedulePickup extends ModelBase{

	public SchedulePickup(WebDriver driver) {
		super(driver);               // TODO Auto-generated constructor stub
	}

	protected WebElement SchedulePreprintNo = null;
	protected WebElement SchedulePayDriver = null;
	protected WebElement ScheduleCompanyName = null;
	protected WebElement ScheduleContactName = null;
	protected WebElement ScheduleRoom = null;
	protected WebElement ScheduleFloor = null;
	protected WebElement ScheduleMarkResidential = null;
	protected WebElement SchedulePickupDate = null;
	protected WebElement ScheduleBtnNext = null;
	
		
		public WebElement SchedulePreprintNo() {
			WebElement SchedulePreprintNo = driver.findElement(By.xpath("//*[@id='radioShippingN']"));
			return SchedulePreprintNo;
		}
	
		public WebElement SchedulePayDriver() {
			WebElement SchedulePayDriver = driver.findElement(By.xpath("//*[@id='chkPayCheck']"));
			return SchedulePayDriver;
		}
		
		public WebElement ScheduleCompanyName() {
			WebElement ScheduleCompanyName = driver.findElement(By.xpath("//*[@id='addrMDCompanyId']"));
			return ScheduleCompanyName;
		}
		
		public WebElement ScheduleContactName() {
			WebElement ScheduleContactName = driver.findElement(By.xpath("//*[@id='addrMDCustNameId']"));
			return ScheduleContactName;
		}
		
			public WebElement ScheduleRoom() {
			WebElement ScheduleRoom = driver.findElement(By.xpath("//*[@id='addrMDRoomId']"));
			return ScheduleRoom;
		}
		
		public WebElement ScheduleFloor() {
			WebElement ScheduleFloor = driver.findElement(By.xpath("//*[@id='addrMDFloorId']"));
			return ScheduleFloor;
		}
		
		public WebElement ScheduleMarkResidential() {
			WebElement ScheduleMarkResidential = driver.findElement(By.xpath("//*[@id='chkResiAddr']"));
			return ScheduleMarkResidential;
		}
			
		public WebElement SchedulePickupDate() {
			WebElement SchedulePickupDate = driver.findElement(By.xpath("//*[@id='pickupDateDiv']/select"));
			return SchedulePickupDate;
		}
		
		public WebElement ScheduleBtnNext() {
			WebElement ScheduleBtnNext = driver.findElement(By.xpath("//*[@id='nextButtonId']"));
			return ScheduleBtnNext;
		}
		
}
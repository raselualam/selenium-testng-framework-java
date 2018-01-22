package controller;

import org.openqa.selenium.WebDriver;

import talentech.students.model.SchedulePickup;

public class SchedulePickupController extends ControllerBase {

	public SchedulePickup pickupModel = null;
	
	public SchedulePickupController(WebDriver driver) {
		super(driver); // Auto-generated
		
		pickupModel = new SchedulePickup(driver);
}
	

public void shippingLabel(){
	
		pickupModel.SchedulePreprintNo().click();
		pickupModel.SchedulePayDriver().click();
}


public void pickupDetails (String CompanyName, String ContactName, String Room, String Floor) {
		
		pickupModel.ScheduleCompanyName().clear();
		pickupModel.ScheduleCompanyName().sendKeys(CompanyName);
 
		pickupModel.ScheduleContactName().clear();
		pickupModel.ScheduleContactName().sendKeys(ContactName);
	 
		pickupModel.ScheduleRoom().clear();
		pickupModel.ScheduleRoom().sendKeys(Room);
	 
		pickupModel.ScheduleFloor().clear();
		pickupModel.ScheduleFloor().sendKeys(Floor);
	 
		pickupModel.ScheduleMarkResidential().click();
}


public void Next() {
		pickupModel.ScheduleBtnNext().click();
}
		
}

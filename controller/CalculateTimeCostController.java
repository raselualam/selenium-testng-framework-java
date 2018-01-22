package controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import talentech.students.model.CalculateTimeCost;

public class CalculateTimeCostController extends ControllerBase {

	public CalculateTimeCost calculateModel = null;
	
	public CalculateTimeCostController(WebDriver driver) {
		super(driver);                             // Auto-generated
		
		calculateModel = new CalculateTimeCost(driver);
	}
  
 
	
	public void shipFrom( String FromAddress, String FromCountry, String FromCity, String FromZip){
		
		Select objAddress = new Select (calculateModel.CalculateFromAddress());
		objAddress.selectByVisibleText(FromAddress);
	 
		Select objCountry = new Select (calculateModel.CalculateFromCountry());
		objCountry.selectByVisibleText(FromCountry);
 
		calculateModel.CalculateFromCity().clear();
		calculateModel.CalculateFromCity().sendKeys(FromCity);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calculateModel.CalculateFromCity().sendKeys(Keys.DOWN);
		calculateModel.CalculateFromCity().sendKeys(Keys.ENTER);
	 
		calculateModel.CalculateFromZip().clear();
		calculateModel.CalculateFromZip().sendKeys(FromZip);
	 
		calculateModel.CalculateFromResidential().click();
	}

	
	
	public void shipTo(String ToContact, String ToCountry, String ToCity, String ToZip) {	
	 
		Select objContact = new Select (calculateModel.CalculateToContacts());
		objContact.selectByVisibleText(ToContact);
	 
		Select objCountry = new Select (calculateModel.CalculateFromCountry());
		objCountry.selectByVisibleText(ToCountry);		
	 
		calculateModel.CalculateToCity().clear();
		calculateModel.CalculateToCity().sendKeys(ToCity);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calculateModel.CalculateToCity().sendKeys(Keys.DOWN);
		calculateModel.CalculateToCity().sendKeys(Keys.ENTER);
	 
		calculateModel.CalculateToZip().clear();
		calculateModel.CalculateToZip().sendKeys(ToZip);
	 
		calculateModel.CalculateDestinationType().click();
	 
		calculateModel.CalculateBtnCalender().click();
	 
		calculateModel.CalculateSelectDate().click();
	 
		calculateModel.CalculateBtnUpdate().click();
	}
		
}

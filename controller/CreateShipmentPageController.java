package controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import talentech.students.model.CreateShipmentPageModel;

public class CreateShipmentPageController extends ControllerBase {

	public CreateShipmentPageModel shipmentModel = null;
	
	public CreateShipmentPageController(WebDriver driver) {
		super(driver);                     // Auto-generated
		
		shipmentModel = new CreateShipmentPageModel(driver);
	}

	
	public void whereShipment (String toCompanyName, String toContact, String toAddress, String toCity, String toState, String toZipcode, String toTelephone) {
		
		shipmentModel.toCompanyName().clear();
		shipmentModel.toCompanyName().sendKeys(toCompanyName);
		
		shipmentModel.toContact().clear();
		shipmentModel.toContact().sendKeys(toContact);
		
		shipmentModel.toAddress().clear();
		shipmentModel.toAddress().sendKeys(toAddress);
		
		shipmentModel.toCity().clear();
		shipmentModel.toCity().sendKeys(toCity);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		shipmentModel.toCity().sendKeys(Keys.DOWN);
		shipmentModel.toCity().sendKeys(Keys.ENTER);
		
		Select objToState = new Select(shipmentModel.toState());
		objToState.selectByVisibleText(toState);
	 
		shipmentModel.toZipcode().clear();
		shipmentModel.toZipcode().sendKeys(toZipcode);
	 
		shipmentModel.toTelephone().clear();
		shipmentModel.toTelephone().sendKeys(toTelephone);	
	}
	
	public void whatShiping (String numberPackage, String packagingType, String packageUSD) {
		
		Select objNumberPackage = new Select(shipmentModel.numberPackage());
		objNumberPackage.selectByVisibleText(numberPackage);
	
		Select objpackagingType = new Select(shipmentModel.packagingType());
		objpackagingType.selectByVisibleText(packagingType);
	 
		shipmentModel.packageUSD().clear();
		shipmentModel.packageUSD().sendKeys(packageUSD);
	}
	
	public void Next() {
		shipmentModel.btnNext().click();
	}
	
}
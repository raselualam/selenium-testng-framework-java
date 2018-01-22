package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import talentech.students.model.ShippingTabPageModel;

public class ShippingTabController extends ControllerBase {

	public ShippingTabPageModel shippingTab = null;
	
	public ShippingTabController(WebDriver driver) {
		super(driver);         // Auto from extends
		
		shippingTab = new ShippingTabPageModel(driver);
	}

	public void usernameLabelAssort(String USER) {
		String msgAct = shippingTab.usernameLabel().getText();
		String msgExp = USER;
		Assert.assertTrue(msgAct.contentEquals(msgExp));
	}
	
	
	public void createShippingClick() {
		Actions hoverActionS = new Actions (driver);
		hoverActionS.moveToElement(shippingTab.hoberShipping());
		hoverActionS.perform();
		shippingTab.createShipping().click();
	}
	
	public void createReturnClick() {
		Actions hoverActionR = new Actions (driver);
		hoverActionR.moveToElement(shippingTab.hoberShipping());
		hoverActionR.perform();	
		shippingTab.createReturn().click();
	}
	
	public void calculateTimeCost() {
		Actions hoverActionC = new Actions (driver);
		hoverActionC.moveToElement(shippingTab.hoberShipping());
		hoverActionC.perform();	
		shippingTab.calculateTimeCost().click();
	}
	
	public void schedulePickupClick(){
		Actions hoverActionP = new Actions (driver);
		hoverActionP.moveToElement(shippingTab.hoberShipping());
		hoverActionP.perform();	
		shippingTab.schedulePickup().click();
	}
	
}

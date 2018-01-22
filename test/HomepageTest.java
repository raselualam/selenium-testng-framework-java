package test;

import org.testng.annotations.Test; 

import baseclass.BaseClass;

public class HomepageTest extends BaseClass {

	
@Test (dataProvider="login", dataProviderClass=talentech.students.dataprovider.LoginDataProvider.class)
public void loginTest(String UserID, String UserPASS, String LabelAssort){
	homepage().loginUPS(UserID, UserPASS);
	shipment().usernameLabelAssort(LabelAssort);
}
		
@Test
public void createShipmentTest(){
	homepage().loginUPS("raselualam", "BlahBlah");
	shipment().usernameLabelAssort("Md Rasel U Alam");
	shipment().createShippingClick();
	createShipment().whereShipment("Rasel", "9736818296", "510 Hamilton St", "Harrison", "New Jersey", "07029", "9736818296");
	createShipment().whatShiping("1", "UPS Letter", "10");
	createShipment().Next();
}

@Test
public void createReturnTest(){
	homepage().loginUPS("raselualam", "BlahBlah");
	shipment().usernameLabelAssort("Md Rasel U Alam");
	shipment().createReturnClick();	
	createReturn().shipmentFrom("Select One", "Rasel", "9736818296", "510 Hamilton St", "Harrison", "New Jersey", "07029", "9736818296");
	createReturn().whatReturning("UPS Letter", "10", "Offer Letter");
	createReturn().returnSubmit();
}

@Test
public void calculateTimeCostTest(){
	homepage().loginUPS("raselualam", "BlahBlah");
	shipment().usernameLabelAssort("Md Rasel U Alam");
	shipment().calculateTimeCost();
	calculate().shipFrom("Not Available", "United States", "Harrison", "07029");
	calculate().shipTo("Not Available", "United States", "Harrison", "07029");
}

@Test
public void schedulePickupTest(){
	homepage().loginUPS("raselualam", "BlahBlah");
	shipment().usernameLabelAssort("Md Rasel U Alam");
	shipment().schedulePickupClick();
	pickup().shippingLabel();
	pickup().pickupDetails("Rasel", "Rasel", "510", "5");
	pickup().Next();

}
}
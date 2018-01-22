package controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import talentech.students.model.CreateReturnPageModel;

public class CreateReturnPageController extends ControllerBase {
  
	public CreateReturnPageModel returnModel = null;
	
	public CreateReturnPageController (WebDriver driver) {
		super(driver);                // Auto-generated
	
		returnModel = new CreateReturnPageModel(driver);
  }

	
public void shipmentFrom ( String AddressBook, 
						   String FromCompanyName, 
						   String FromContact, 
						   String FromAddress,
						   String FromCity,
						   String FromState,
						   String FromZipcode,
						   String FromTelephone) {
	
	Select objAddressBook = new Select(returnModel.returnAddressBook());
	objAddressBook.selectByVisibleText(AddressBook);
 
	returnModel.returnFromCompanyName().clear();
	returnModel.returnFromCompanyName().sendKeys(FromCompanyName);

	returnModel.returnFromContact().clear();
	returnModel.returnFromContact().sendKeys(FromContact);
 
	returnModel.returnFromAddress().clear();
	returnModel.returnFromAddress().sendKeys(FromAddress);
 
	returnModel.returnFromCity().clear();
	returnModel.returnFromCity().sendKeys(FromCity);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	returnModel.returnFromCity().sendKeys(Keys.DOWN);
	returnModel.returnFromCity().sendKeys(Keys.ENTER);
 
	Select objState = new Select(returnModel.returnFromState());
	objState.selectByVisibleText(FromState);
 
	returnModel.returnFromZipcode().clear();
	returnModel.returnFromZipcode().sendKeys(FromZipcode);
 
	returnModel.returnFromTelephone().clear();
	returnModel.returnFromTelephone().sendKeys(FromTelephone);
}

public void whatReturning (String returnPackagingType,
						   String returnPackageUSD,
						   String MechandiseDescription) {
	
	Select ObjType = new Select(returnModel.returnPackagingType());
	ObjType.selectByVisibleText(returnPackagingType);
 
	returnModel.returnPackageUSD().clear();
	returnModel.returnPackageUSD().sendKeys(returnPackageUSD);
 
	returnModel.returnMechandiseDescription().clear();
	returnModel.returnMechandiseDescription().sendKeys(MechandiseDescription);
}

public void returnSubmit() {
	returnModel.returnBtnNext().click();
}

}
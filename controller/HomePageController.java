package controller;

import org.openqa.selenium.WebDriver;

import talentech.students.model.HomePageModelPage;

public class HomePageController extends ControllerBase {
	
	public HomePageModelPage homepageModel = null;
	
	public HomePageController(WebDriver driver) {
		super(driver); // Auto From extends
		
		homepageModel= new HomePageModelPage(driver);
	}

	public void loginUPS(String id, String pass){
		homepageModel.userId().clear();
		homepageModel.userId().sendKeys(id);
		homepageModel.userPassword().clear();
		homepageModel.userPassword().sendKeys(pass);
		homepageModel.logIn().click();
	}
	

}
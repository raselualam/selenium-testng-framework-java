package baseclass;

import org.testng.annotations.BeforeMethod;

import talentech.students.controller.CalculateTimeCostController;
import talentech.students.controller.CreateReturnPageController;
import talentech.students.controller.CreateShipmentPageController;
import talentech.students.controller.HomePageController;
import talentech.students.controller.SchedulePickupController;
import talentech.students.controller.ShippingTabController;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {

	protected WebDriver driver=null;
	
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.ups.com/one-to-one/login");
	  driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	  //make other for CHORME, IE, SAFARI
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  
  public HomePageController homepage (){
	  return new HomePageController(driver);
  }
  
  public ShippingTabController shipment (){
	  return new ShippingTabController(driver);
  }
  
  public CreateShipmentPageController createShipment (){
	  return new CreateShipmentPageController(driver);
  }
  
  public CreateReturnPageController createReturn (){
	  return new CreateReturnPageController(driver);
  }
  
  public CalculateTimeCostController calculate () {
	  return new CalculateTimeCostController(driver);
  }
 
  public SchedulePickupController pickup () {
	  return new SchedulePickupController(driver);
  }
 
  }
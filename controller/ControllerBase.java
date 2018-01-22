package controller;

import org.openqa.selenium.WebDriver;

public class ControllerBase {
	protected WebDriver driver;

	public ControllerBase (WebDriver driver) {
		this.driver=driver;
	}

}
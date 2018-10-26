package com.cleartrip.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseUI {
	WebDriver driver;
	public BaseUI(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	

}

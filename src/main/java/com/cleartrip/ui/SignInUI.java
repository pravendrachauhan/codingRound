package com.cleartrip.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInUI extends BaseUI{
	
	public SignInUI(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Your trips")
    private WebElement yourTripsLink;
	
	@FindBy(id = "SignIn")
    private WebElement signInLink;

	@FindBy(id = "signInButton")
    private WebElement signInButton;

	@FindBy(id = "errors1")
    private WebElement errorsText;
	
	public WebElement getYourTripsLink() {
		return yourTripsLink;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getErrorsText() {
		return errorsText;
	}



}

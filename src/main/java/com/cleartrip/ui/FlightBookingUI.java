package com.cleartrip.ui;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBookingUI extends BaseUI{

	public FlightBookingUI(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "OneWay")
    private WebElement oneWayLink;
	
	@FindBy(id = "FromTag")
    private WebElement fromTagLink;
	
	@FindBy(id = "ui-id-1")
    private WebElement originOptions;
	
	@FindBy(id = "ui-id-2")
    private WebElement destinationOptions;
	
	@FindBy(id = "ToTag")
    private WebElement toTagLink;
	
	//it will give only enabled dates
	@FindBy(xpath = "//*[@id='ui-datepicker-div']//td[not(@class=' weekEnd ui-datepicker-unselectable disabled undefined')][not(@class=' ui-datepicker-unselectable disabled undefined')]")
    private List<WebElement> datePicker;
	
	@FindBy(id = "SearchBtn")
    private WebElement searchButton;
	
	public WebElement getOneWayLink() {
		return oneWayLink;
	}

	public WebElement getFromTagLink() {
		return fromTagLink;
	}

	public WebElement getOriginOptions() {
		return originOptions;
	}

	public WebElement getDestinationOptions() {
		return destinationOptions;
	}

	public WebElement getToTagLink() {
		return toTagLink;
	}

	public WebElement getDatePickerToday() {
		return datePicker.get(0);
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

}

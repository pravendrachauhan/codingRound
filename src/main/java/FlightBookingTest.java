import com.cleartrip.ui.FlightBookingUI;
import com.cleartrip.utils.Functions;
import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FlightBookingTest extends BaseTest {
	
    @Test
    public void testThatResultsAppearForAOneWayJourney() {
    	FlightBookingUI flightUi=new FlightBookingUI(driver);
        
    	flightUi.getOneWayLink().click();

    	flightUi.getFromTagLink().clear();
    	flightUi.getFromTagLink().sendKeys("Bangalore");

        //wait for the auto complete options to appear for the origin

        Functions.waitFor(2000);
        List<WebElement> originOptions = flightUi.getOriginOptions().findElements(By.tagName("li"));
        originOptions.get(0).click();

        flightUi.getToTagLink().clear();
        flightUi.getToTagLink().sendKeys("Delhi");

        //wait for the auto complete options to appear for the destination

        Functions.waitFor(2000);
        //select the first item from the destination auto complete list
        List<WebElement> destinationOptions = flightUi.getDestinationOptions().findElements(By.tagName("li"));
        destinationOptions.get(0).click();

        flightUi.getDatePickerToday().click();

        //all fields filled in. Now click on search
        flightUi.getSearchButton().click();

        Functions.waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(By.className("searchSummary")));

       

    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}

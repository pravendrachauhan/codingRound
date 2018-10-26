import com.cleartrip.ui.HotelBookingUI;
import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBookingTest extends BaseTest{

     @Test
    public void shouldBeAbleToSearchForHotels() {
    	HotelBookingUI hotelUi=new HotelBookingUI(driver);
    	hotelUi.getHotelLink().click();

    	hotelUi.getLocalityTextBox().sendKeys("Indiranagar, Bangalore");

        new Select(hotelUi.getTravellerSelection()).selectByVisibleText("1 room, 2 adults");
        hotelUi.getSearchButton().click();

    }

    private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }

}

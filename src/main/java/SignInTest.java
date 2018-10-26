import com.cleartrip.ui.SignInUI;
import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
    	SignInUI signInUi=new SignInUI(driver);
    	signInUi.getYourTripsLink().click();
    	signInUi.getSignInLink().click();
    	switchToFrame("modal_window");
    	
    	signInUi.getSignInButton().click();

        String errors1 = signInUi.getErrorsText().getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
    }
    
    public void switchToFrame(String frameId) {
    	driver.switchTo().frame(frameId);
    }
 

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cleartrip.ui.BaseUI;
import com.cleartrip.utils.Configs;
import com.cleartrip.utils.Functions;

public class BaseTest {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		Functions.setDriverPath();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		new BaseUI(driver);
		driver.get(Configs.URL);
		Functions.waitFor(2000);
	}

	@AfterClass
	public void tearDown() {
		 //close the browser
	    driver.quit();
	}
	
}

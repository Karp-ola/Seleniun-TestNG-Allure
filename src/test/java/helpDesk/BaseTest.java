package helpDesk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.helpDesk.BasePage;
import utils.ConfigProvider;

import java.time.Duration;

abstract public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		BasePage.setDriver(driver);
		driver.get(ConfigProvider.HELP_DESK_URL);
	}

	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}

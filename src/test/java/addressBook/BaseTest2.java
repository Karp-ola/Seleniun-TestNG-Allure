package addressBook;

import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.addressBook.BasePageAB;
import utils.ConfigProvider;

import java.time.Duration;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

abstract public class BaseTest2 {

	WebDriver driver;

	@BeforeMethod
	public void setUp(){ allureEnvironmentWriter(
			ImmutableMap.<String, String>builder()
					.put("Browser", "Chrome")
					.put("Browser.Version", " 99.0.4844.51")
					.build(), System.getProperty("user.dir")
					+ "/allure-results/");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		BasePageAB.setDriver(driver);
		driver.get(ConfigProvider.ADDTESS_BOOK_URL);
	}

	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}



}


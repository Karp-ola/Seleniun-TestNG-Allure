import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import utils.ConfigProvider;

import java.time.Duration;

abstract public class BaseTest {

	protected WebDriver driver;

	@BeforeEach
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		BasePage.setDriver(driver);
		driver.get(ConfigProvider.URL);
	}

	@AfterEach
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}

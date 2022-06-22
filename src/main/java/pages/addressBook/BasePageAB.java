package pages.addressBook;

import org.openqa.selenium.WebDriver;

abstract public class BasePageAB {

	protected static WebDriver driver;

	public static void setDriver(WebDriver webDriver){
		driver = webDriver;
	}

}

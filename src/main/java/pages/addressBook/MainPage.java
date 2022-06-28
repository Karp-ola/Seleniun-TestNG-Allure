package pages.addressBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePageAB{

	@FindBy(xpath = "//a[@id = 'sign-in']")
	private WebElement signInLink;

	public MainPage() {
		PageFactory.initElements(driver, this);	
	}

	public LoginPage clickSignInLink(){
		signInLink.click();
		return new LoginPage();
	}


}

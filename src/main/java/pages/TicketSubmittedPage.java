package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketSubmittedPage extends BasePage{

	@FindBy(id = "userDropdown")
	private WebElement loginButton;

	public TicketSubmittedPage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickLoginButton(){
		loginButton.click();
		return new LoginPage();
	}

}

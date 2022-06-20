package pages.helpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(id = "username")
	private WebElement usernameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage fillUsernameField(String username){
		usernameField.sendKeys(username);
		return this;
	}

	public LoginPage fillPasswordField(String password){
		passwordField.sendKeys(password);
		return this;
	}

	public TicketsPage clickSubmitLoginButton(){
		loginButton.click();
		return new TicketsPage();
	}
}

package pages.addressBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(name = "commit")
	private WebElement singInButton;

	@FindBy(id = "session_email")
	private WebElement emailField;

	@FindBy(id = "session_email")
	private WebElement passwordField;

	@FindBy(xpath = "//div[@class='row']/a")
	private WebElement signUpPageLink;


	public SignUpPage clickSignUpLink(){
		signUpPageLink.click();
		return new SignUpPage();
	}

	public LoginPage fillEmailField(String emailValue){
		emailField.sendKeys(emailValue);
		return this;
	}

	public LoginPage fillPasswordField(String passwordValue){
		passwordField.sendKeys(passwordValue);
		return this;
	}

	public LoginPage clickSignInButton(){
		singInButton.click();
		return this;
	}

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
}

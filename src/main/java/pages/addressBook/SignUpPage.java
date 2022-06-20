package pages.addressBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{

	@FindBy(id = "user_email")
	public WebElement emailField;

	@FindBy(id = "user_password")
	public WebElement passwordField;

	@FindBy(name = "commit")
	public WebElement signUpButton;

	@FindBy(xpath = "//div[@class='row']/a")
	private WebElement signIpPageLink;

	public LoginPage clickSignInPageLink(){
		signIpPageLink.click();
		return new LoginPage();
	}

	public SignUpPage fillEmailField(String emailValue){
		emailField.sendKeys(emailValue);
		return this;
	}

	public SignUpPage fillPasswordField(String passwordValue){
		passwordField.sendKeys(passwordValue);
		return this;
	}

	public SignUpPage clickSignUpButton(){
		signUpButton.click();
		return this;
	}

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
}

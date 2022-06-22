package pages.addressBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSignInPage extends BasePageAB{

	@FindBy(xpath = "//a[@data-test='home']")
	private WebElement homeLink;

	@FindBy(xpath = "//a[@data-test='addresses']")
	private WebElement addressesLink;

	@FindBy(xpath = "//a[@data-test='sign-out']")
	private WebElement signOutLink;

	public AfterSignInPage() {
		PageFactory.initElements(driver, this);
	}

	public AddressPage clickAddressesLink(){
		addressesLink.click();
		return new AddressPage();
	}

	public LoginPage clickSignOutLink(){
		signOutLink.click();
		return new LoginPage();
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
}

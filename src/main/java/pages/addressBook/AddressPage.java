package pages.addressBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BasePageAB{

	@FindBy(xpath = "//span[@class='navbar-text']")
	private WebElement userEmailLabel;

	@FindBy(xpath = "//a[@data-test='create']")
	private WebElement newAddressButton;

	public AddressPage() {
		PageFactory.initElements(driver, this);
	}


	public NewAddressPage clickNewAddressButton(){
		newAddressButton.click();
		return new NewAddressPage();
	}

	public WebElement getUserEmailLabel() {
		return userEmailLabel;
	}


}

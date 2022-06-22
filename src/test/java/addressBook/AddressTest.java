package addressBook;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utils.Interests;
import pages.addressBook.MainPage;
import pages.addressBook.NewAddressPage;
import utils.ConfigProvider;

public class AddressTest extends BaseTest2 {

	@Test(groups = {"ABTests", "UITests"})
	@Description("создать новый адресс")
	public void createNewAddress(){
		MainPage mainPage = new MainPage();
		Interests[] interests = {Interests.DANCING, Interests.READING};

		NewAddressPage newAddressPage = mainPage
				.clickSignInLink()
				.fillEmailField(ConfigProvider.USER_ADDRESS_BOOK_LOGIN)
				.fillPasswordField(ConfigProvider.USER_ADDRESS_BOOK_PASSWORD)
				.clickSignInButton()
				.clickAddressesLink()
				.clickNewAddressButton();

		newAddressPage.fillFirstNameField("Sheldon")
				.fillLastNameField("Cooper")
				.fillAddress1Field("Sunset Boulevard")
				.fillAddress2Field("32")
				.fillCityField("Los Angeles")
				.selectStateFromDropDown("California")
				.fillZipCodeField("220036")
				.selectCountryRadioButton("US")
				.fillBirthdayDate("10.08.1999")
				.fillAgeTextBox("22")
				.fillWebsiteField("http://SheldonCooper.com")
				.addPicture("/home/user/IdeaProjects/Selenium, JUnit, Allure/src/main/resources/files/picture.png")
				.fillPhoneField("3215782")
				.fillNoteField("My info")
		//		.selectInterests(interests)
				.clickCreateAddressButton();
	}
}

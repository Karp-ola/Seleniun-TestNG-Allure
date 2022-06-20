package addressBook;

import org.testng.annotations.Test;
import pages.addressBook.MainPage;
import pages.addressBook.SignUpPage;

public class AddressBookTest extends BaseTest2 {

	@Test
	public void signUpTest(){
		MainPage mainPage = new MainPage();

		SignUpPage signUpPage = mainPage.clickSignInLink()
				.clickSignUpLink()
				.fillEmailField("Volha@mail.ru")
				.fillPasswordField("fgk12")
				.clickSignUpButton();
	}




}

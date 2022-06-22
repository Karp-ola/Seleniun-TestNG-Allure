package addressBook;

import io.qameta.allure.Description;
import io.qameta.allure.Flaky;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.addressBook.AfterSignInPage;
import pages.addressBook.LoginPage;
import pages.addressBook.MainPage;
import pages.addressBook.SignUpPage;
import utils.ConfigProvider;
import utils.StringModifier;

public class ABLoginTest extends BaseTest2 {

	@Test( groups = {"ABTests", "ABLoginTests", "UITests"})
	@Flaky
	@Description ("тест авторизации")
	public void signUpTest(){
		MainPage mainPage = new MainPage();

		SignUpPage signUpPage = mainPage.clickSignInLink()
				.clickSignUpLink()
				.fillEmailField(StringModifier.createRandomEmail())
				.fillPasswordField(StringModifier.createPasswordString())
				.clickSignUpButton();
		Assert.assertEquals(driver.getCurrentUrl(), "http://a.testaddressbook.com/users", "Не то URL");
		Assert.assertTrue(signUpPage.getSignIpPageLink().isDisplayed(), "Не отражается Sign in кнопка");
	}

	@Test(groups = {"ABTests", "ABLoginTests", "UITests"})
	@Description("залогинится")
	public void signInTest(){
		MainPage mainPage = new MainPage();

		AfterSignInPage afterSignInPage = mainPage.clickSignInLink()
				.fillEmailField(ConfigProvider.USER_ADDRESS_BOOK_LOGIN)
				.fillPasswordField(ConfigProvider.USER_ADDRESS_BOOK_PASSWORD)
				.clickSignInButton();

		Assert.assertEquals(driver.getCurrentUrl(), "http://a.testaddressbook.com/", "Не то URL");
		Assert.assertTrue(afterSignInPage.getSignOutLink().isDisplayed(), "Не отражается Sign in кнопка");
	}

	@Test(groups = {"ABTests", "ABLoginTests", "UITests"})
	@Flaky
	@Description("вылогинется")
	public void signOutTest(){
		MainPage mainPage = new MainPage();

		LoginPage loginPage = mainPage.clickSignInLink()
				.fillEmailField(ConfigProvider.USER_ADDRESS_BOOK_LOGIN)
				.fillPasswordField(ConfigProvider.USER_ADDRESS_BOOK_PASSWORD)
				.clickSignInButton()
				.clickSignOutLink();

		Assert.assertEquals(driver.getCurrentUrl(), "http://a.testaddressbook.com/sign_in", "Не тот URL");
		Assert.assertTrue(loginPage.getSingInButton().isDisplayed(), "Не отражается Sign in кнопка");
	}
}

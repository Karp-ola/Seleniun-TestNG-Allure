package helpDesk;

import io.qameta.allure.Description;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.helpDesk.MainPage;
import pages.helpDesk.TicketPage;
import pages.helpDesk.TicketSubmittedPage;
import utils.ConfigProvider;
import utils.StringModifier;

public class HelpDeskTest extends BaseTest {

	@Test
	@Description("E2E test for creating ticket, searching and checking fields of created ticket")
	public void createAndCheckTicket() throws InterruptedException {

		MainPage mainPage = new MainPage();

		TicketSubmittedPage ticketSubmittedPage = mainPage
				.fillSummaryField(StringModifier.createUniqueString(ConfigProvider.SUMMARY))
				.selectQueue(ConfigProvider.QUEUE)
				.fillDescriptionField(ConfigProvider.DESCRIPTION)
				.selectPriority(ConfigProvider.PRIORITY)
				.selectDate()
				.fillEmailField(ConfigProvider.EMAIL)
				.clickSubmitButton();

		TicketPage ticketPage = ticketSubmittedPage.clickLoginButton()
				.fillUsernameField(ConfigProvider.USER_LOGIN)
				.fillPasswordField(ConfigProvider.USER_PASSWORD)
				.clickSubmitLoginButton()
				.searchTicket(ConfigProvider.SUMMARY)
				.clickOnTicket(ConfigProvider.SUMMARY);
		Thread.sleep(5000);

		Assert.assertEquals(ticketPage.getDescription().getText(), ConfigProvider.DESCRIPTION);
		Assert.assertEquals(ticketPage.getEmail().getText(), ConfigProvider.EMAIL);
		Assert.assertEquals(ticketPage.getPriority().getText(), ConfigProvider.PRIORITY);

	}
}

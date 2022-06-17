import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.TicketPage;
import pages.TicketSubmittedPage;
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

		Assertions.assertEquals(ticketPage.getDescription().getText(), ConfigProvider.DESCRIPTION);
		Assertions.assertEquals(ticketPage.getEmail().getText(), ConfigProvider.EMAIL);
		Assertions.assertEquals(ticketPage.getPriority().getText(), ConfigProvider.PRIORITY);

	}
}

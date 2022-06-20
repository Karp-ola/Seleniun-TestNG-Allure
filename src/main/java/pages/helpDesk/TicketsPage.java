package pages.helpDesk;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketsPage extends BasePage {

	@FindBy(id = "search_query")
	private WebElement searchField;

	@FindBy(xpath = "//table/tbody/tr/td[2]/div/a[contains(text(),'Broken link')]")
	private WebElement foundTicket;

	@FindBy(xpath = "//a[contains(text(), 'Next')]")
	private WebElement nextButton;

	@FindBy(xpath = "//ul[@class='pagination']/li[last()-1]/a")
	private WebElement lastPage;


	public TicketsPage() {
		PageFactory.initElements(driver, this);
	}

	public TicketsPage searchTicket(String ticketSummary){
		searchField.sendKeys(ticketSummary, Keys.ENTER);
		return this;
	}

	public TicketPage clickOnTicket(String titleSummary){
		lastPage.click();
		foundTicket.click();
		return new TicketPage();
	}
}

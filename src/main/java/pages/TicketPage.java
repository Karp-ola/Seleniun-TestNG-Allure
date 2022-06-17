package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends BasePage{

	@FindBy(xpath = "//div[@class='table-responsive']/table/thead/tr/th/h3")
	private WebElement summary;

	@FindBy(xpath = "//table/tbody//tr[3]/td[1]")
	private WebElement priority;

	@FindBy(xpath = "//table/tbody//tr[2]/td[2]")
	private WebElement email;

	@FindBy(xpath = "//td[@id ='ticket-description']/p")
	private WebElement description;

	public TicketPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getPriority() {
		return priority;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getDescription() {
		return description;
	}
}

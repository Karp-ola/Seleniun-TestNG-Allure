package pages.helpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends BasePage {

	@FindBy(name = "queue")
	private WebElement queueSelElement;

	@FindBy(name = "title")
	private WebElement summaryField;

	@FindBy(name = "body")
	private WebElement descriptionField;

	@FindBy(name = "priority")
	private WebElement prioritySelElement;

	@FindBy(name = "due_date")
	private WebElement dateField;

	@FindBy(css = "a.ui-state-default.ui-state-highlight")
	private WebElement exactDate;

	@FindBy(name = "submitter_email")
	private WebElement emailField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;


	public MainPage() {
		PageFactory.initElements(driver, this);
	}

	public MainPage selectQueue(String option){
		Select select = new Select(queueSelElement);
		select.selectByVisibleText(option);
		return this;
	}

	public MainPage fillSummaryField(String summaryContent){
		summaryField.sendKeys(summaryContent);
		return this;
	}

	public MainPage fillDescriptionField(String descriptionContent){
		descriptionField.sendKeys(descriptionContent);
		return this;
	}

	public MainPage selectPriority(String option){
		Select select = new Select(prioritySelElement);
		select.selectByVisibleText(option);
		return this;
	}

	public MainPage selectDate(){
		dateField.click();
		exactDate.click();
		return this;
	}

	public MainPage fillEmailField(String emailContent){
		emailField.sendKeys(emailContent);
		return this;
	}

	public TicketSubmittedPage clickSubmitButton(){
		submitButton.click();
		return new TicketSubmittedPage();
	}

}

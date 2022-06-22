package pages.addressBook;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAddressPage extends BasePageAB{

	@FindBy(name = "address[first_name]")
	private WebElement firstNameField;

	@FindBy(name = "address[last_name]")
	private WebElement lastNameField;

	@FindBy(name = "address[address1]")
	private WebElement address1Field;

	@FindBy(name = "address[address2]")
	private WebElement address2Field;

	@FindBy(name = "address[city]")
	private WebElement cityField;

	@FindBy(name = "address[state]")
	private WebElement stateDropDown;

	@FindBy(name = "address[zip_code]")
	private WebElement zipCodeField;

	@FindBy(xpath = "//div[@class ='form-group row']/input[@type = 'radio'][1]")
	private WebElement countryUSRadioButton;

	@FindBy(xpath = "//div[@class ='form-group row']/input[@type = 'radio'][2]")
	private WebElement countryCanadaRadioButton;

	@FindBy(name = "address[birthday]")
	private WebElement birthdayField;

	@FindBy(name = "address[age]")
	private WebElement ageTextBox;

	@FindBy(name = "address[website]")
	private WebElement websiteField;

	@FindBy(name = "address[phone]")
	private WebElement phoneField;

	@FindBy(name = "address[picture]")
	private WebElement pictureField;

	@FindBy(name = "address[note]")
	private WebElement noteTextField;

	@FindBy(name = "address[interest_climb]")
	private WebElement interestClimbingCheckBox;

	@FindBy(name = "address[interest_dance]")
	private WebElement interestDancingCheckBox;

	@FindBy(name = "address[interest_read]")
	private WebElement interestReadingCheckBox;

	@FindBy(name = "commit")
	private WebElement createAddressButton;


	public NewAddressPage() {
		PageFactory.initElements(driver, this);
	}

	@Step("заполнить поле First Name")
	public NewAddressPage fillFirstNameField(String firstNameFieldValue){
		firstNameField.sendKeys(firstNameFieldValue);
		return this;
	}
	@Step("заполнить поле Last Name")
	public NewAddressPage fillLastNameField(String lastNameFieldValue){
		lastNameField.sendKeys(lastNameFieldValue);
		return this;
	}
	@Step("заполнить поле Address1")
	public NewAddressPage fillAddress1Field(String address1FieldValue){
		address1Field.sendKeys(address1FieldValue);
		return this;
	}
	@Step("заполнить поле Address2")
	public NewAddressPage fillAddress2Field(String address2FieldValue){
		address2Field.sendKeys(address2FieldValue);
		return this;
	}
	@Step("заполнить поле City")
	public NewAddressPage fillCityField(String cityFieldValue){
		cityField.sendKeys(cityFieldValue);
		return this;
	}
	@Step("выбрать опцию из выпадающего списка State")
	public NewAddressPage selectStateFromDropDown(String stateValue){
		Select dropdown = new Select(stateDropDown);
		dropdown.selectByVisibleText("Arizona");
		return this;
	}
	@Step("заполнить поле ZipCode")
	public NewAddressPage fillZipCodeField(String zipCodeValue){
		zipCodeField.sendKeys(zipCodeValue);
		return this;
	}

	@Step("выбрать радиобаттон Country")
	public NewAddressPage selectCountryRadioButton(String countryValue){
		if(countryValue.equals("US")) {
			countryUSRadioButton.click();
		}else if(countryValue.equals("Canada")){
			countryCanadaRadioButton.click();
		}
		return this;
	}
    @Step("заполнить поле birthday")
	public NewAddressPage fillBirthdayDate(String date){
		birthdayField.sendKeys(date);
		return this;
	}

	@Step("заполнить поле Age")
	public NewAddressPage fillAgeTextBox(String ageValue){
		ageTextBox.sendKeys(ageValue);
		return this;
	}
	@Step("заполнить поле Website")
	public NewAddressPage fillWebsiteField(String websiteValue){
		websiteField.sendKeys(websiteValue);
		return this;
	}
	@Step("заполнить поле Phone")
	public NewAddressPage fillPhoneField(String phoneValue){
		phoneField.sendKeys(phoneValue);
		return this;
	}
	@Step("добавить изображение")
	public NewAddressPage addPicture(String pathToImage){
		pictureField.sendKeys(pathToImage);
		return this;
	}
	@Step("заполнить поле Note")
	public NewAddressPage fillNoteField(String noteValue){
		noteTextField.sendKeys(noteValue);
		return this;
	}

	@Step("кликнуть на кнопку Create Address")
	public NewAddressPage clickCreateAddressButton(){
		createAddressButton.click();
		return this;
	}
/*
	@Step("Выбрать интересы")
	public NewAddressPage selectInterests(Interests[] interests){
		for(int i = 0; i < interests.length; i++){
			if(interests[i].equals(Interests.CLIMBING)){
				clickClimbingCheckBox();
			}else if(interests[i].equals(Interests.DANCING)){
				clickDancingCheckBox();
			}else if(interests[i].equals(Interests.READING)){
				clickReadingCheckBox();
			}
		}
		return this;
	}
*/
	@Step("чекнуть чекбокс READIND")
	public void clickReadingCheckBox(){
		interestReadingCheckBox.click();
	}

	@Step("чекнуть чекбокс DANCING")
	public void clickDancingCheckBox(){
		interestDancingCheckBox.click();
	}

	@Step("чекнуть чекбокс CLIMBING")
	public void clickClimbingCheckBox() {
		interestClimbingCheckBox.click();
	}

}

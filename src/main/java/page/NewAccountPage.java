package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class NewAccountPage extends BasePage{

	WebDriver driver;
	
	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using = ("//input[@id='account']")) WebElement ACCOUNT_TITLE;
	@FindBy(how=How.XPATH, using = ("//input[@id='description']")) WebElement DESCRIPTION;
	@FindBy(how=How.XPATH, using = ("//input[@id='balance']")) WebElement INITIAL_BALANCE;
	@FindBy(how=How.XPATH, using = ("//input[@id='account_number']")) WebElement ACCOUNT_NUMBER;
	@FindBy(how=How.XPATH, using = ("//input[@id='contact_person']")) WebElement CONTACT_PERSON;
	@FindBy(how=How.XPATH, using = ("//input[@id='contact_phone']")) WebElement PHONE;
	@FindBy(how=How.XPATH, using = ("//input[@id='ib_url']")) WebElement INTERNET_BANK_URL;
	@FindBy(how=How.XPATH, using = ("//div[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")) WebElement SUBMIT_BUTTON;

	public void enterAccountTitle(String name) {
		ACCOUNT_TITLE.sendKeys(name+randomNumber(999));
	}
	public void enterDescription(String desc) {
		DESCRIPTION.sendKeys(desc);
	}
	public void enterInitialBalance(String bal) {
		INITIAL_BALANCE.sendKeys(bal);
	}
	public void enterAccountNumber(String accnum) {
		ACCOUNT_NUMBER.sendKeys(accnum+randomNumber(999));
	}
	public void enterContactPerson(String contper) {
		CONTACT_PERSON.sendKeys(contper);
	}
	public void enterPhone(String phone) {
		PHONE.sendKeys(phone+randomNumber(999));
	}
	public void enterUrl(String url) {
		INTERNET_BANK_URL.sendKeys(url);
	}
	public void clickSubmitButton() {
		SUBMIT_BUTTON.click();
	}
	
}

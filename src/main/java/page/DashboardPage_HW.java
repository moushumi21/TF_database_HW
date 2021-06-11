package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage_HW {

	WebDriver driver;
	public DashboardPage_HW(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.XPATH, using = ("//span[contains(text(),'Bank & Cash')]")) WebElement BANK_AND_CASH_TAB;
	@FindBy(how=How.XPATH, using = ("//a[contains(text(),'New Account')]")) WebElement NEW_ACCOUNT_TAB;
	
	public String getPageTile() {
		return driver.getTitle();
	}
	public void clickOnBankAndCashTab() {
		BANK_AND_CASH_TAB.click();
	}
	public void clickOnNewAccountTab() {
		NEW_ACCOUNT_TAB.click();
	}
}

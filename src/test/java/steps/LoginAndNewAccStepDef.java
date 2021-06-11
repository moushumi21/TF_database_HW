package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.DashboardPage_HW;
import page.LoginPage_HW;
import page.NewAccountPage;
import util.BrowserFactory_HW;

public class LoginAndNewAccStepDef {

	WebDriver driver;
	LoginPage_HW loginpage;
	DashboardPage_HW dashboardpage;
	NewAccountPage newAccountpage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory_HW.init();
		loginpage = PageFactory.initElements(driver, LoginPage_HW.class);
		dashboardpage = PageFactory.initElements(driver, DashboardPage_HW.class);
		newAccountpage = PageFactory.initElements(driver, NewAccountPage.class);
	}
	@Given  ("^user is on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page() {
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}
	
	@When ("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		loginpage.enterCredentials(username, password);
	}
	
	@And  ("^User clicks on login button$") 
	public void user_clicks_on_login_button() {
			loginpage.clickSigninButton();
		} 
	
	@Then ("^User should be able to see the dashboard$")
	public void user_should_be_able_to_see_the_dashboard() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = dashboardpage.getPageTile();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@When ("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() {
		dashboardpage.clickOnBankAndCashTab();
	}
	@When ("^User clicks on new account$")
	public void user_clicks_on_new_account() {
		dashboardpage.clickOnNewAccountTab();
	}
	@When ("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form(String name, String desc, String bal, String accnum, String contper, String phone, String url) {
		newAccountpage.enterAccountTitle(name);
		newAccountpage.enterDescription(desc);
		newAccountpage.enterInitialBalance(bal);
		newAccountpage.enterAccountNumber(accnum);
		newAccountpage.enterContactPerson(contper);
		newAccountpage.enterPhone(phone);
		newAccountpage.enterUrl(url);
		newAccountpage.clickSubmitButton();
	}
	@Then ("^User should be able to validate new account created$")
	public void user_should_be_able_to_validate_new_account_created() {
		String expectedMsg = "Manage Accounts";
		String actualMsg = driver.findElement(By.xpath("//div[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[1]/h5")).getText();
		Assert.assertEquals(expectedMsg, actualMsg);
	}
	
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}

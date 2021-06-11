package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_HW {
	
	WebDriver driver;
	
	public LoginPage_HW(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how=How.XPATH, using =("//input[@id='username']")) WebElement USERNAME;
	@FindBy(how=How.XPATH, using =("//input[@id='password']")) WebElement PASSWORD;
	@FindBy(how=How.XPATH, using =("//button[contains(text(),'Sign in')]")) WebElement SIGNIN_BUTTON;
	
	public void enterCredentials(String username, String password) {
		USERNAME.sendKeys(username);
		PASSWORD.sendKeys(password);
	}
	public void clickSigninButton() {
		SIGNIN_BUTTON.click();
	}
}

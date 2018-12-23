package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//input[@id='logInEmail']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='passwort']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@class='caption profile']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[contains(@class,'alert') and not (contains(@class, 'msg'))]")
	private WebElement lblSuccess;
	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	public LoginPage enterEmail(String email) {
		enterText(txtEmail, email);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		enterText(txtPassword, password);
		return this;
	}
	
	public HomePage submitLogin() {
		clickOnElement(btnLogin);
		return new HomePage(driver, wait);
	}
	
	public LoginPage verifySuccessfulLogin() {
		assertEquals(lblSuccess.getText(), "×\nThe member has been saved", "Verifikacija nije uspela.");
		return this;
	}

}

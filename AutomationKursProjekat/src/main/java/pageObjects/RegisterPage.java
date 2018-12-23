package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {

	@FindBy(xpath = "//input[@id='user-firma']") //1
	private WebElement txtCompanyName;
	
	@FindBy(xpath = "//input[@id='user-vorname']")//2
	private WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='user-nachname']")//3
	private WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='user-adresse']")//4
	private WebElement txtAddress;
	
	@FindBy(xpath = "//input[@id='user-plz']")//5
	private WebElement txtPlz;
	
	@FindBy(xpath = "//input[@id='user-telefon']")//6
	private WebElement txtOrt;
	
	@FindBy(xpath = "//input[@id='user-telefon']")//7
	private WebElement txtPhone;
	
	@FindBy(xpath = "//input[@id='registration-email']")//8
	private WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='login-email']")//9
	private WebElement txtLoginEmail;
	
	@FindBy(xpath = "//input[@id='passwort']")//10
	private WebElement txtLoginPassword;
	
	@FindBy(xpath = "//input[@id='passwort-check']")//11
	private WebElement txtLoginPasswordCheck;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement btnCheckBox;
	
	@FindBy(xpath = "//button[@id='register-button']")
	private WebElement btnRegister;
	
	
	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	public RegisterPage enterText(String CompanyName) {
		enterText(txtCompanyName, CompanyName);
		return this;
	}
		
	
		
		
	public RegisterPage enterText2(String textFirstName) {
		enterText(txtFirstName, textFirstName);
		return this;
		

		
	}
	public RegisterPage enterText3(String textLastName) {
		enterText(txtLastName, textLastName);
		return this;
		
	
	
	

}
	public RegisterPage enterText4(String textAddress) {
		enterText(txtAddress, textAddress);
		return this;
		
	}
	
	
	
	public RegisterPage enterText5(String textPlz) {
		enterText(txtPlz, textPlz);
		return this;
	}
	
	
	public RegisterPage enterText6(String textOrt) {
		enterText(txtOrt, textOrt);
		return this;
		
	}
	public RegisterPage enterText7(String textPhone) {
		enterText(txtPhone, textPhone);
		return this;
		
	}
	public RegisterPage enterText8(String textEmail) {
		enterText(txtEmail, textEmail);
		return this;
		
	}
	
	public RegisterPage enterText9(String textLoginEmail) {
		enterText(txtLoginEmail, textLoginEmail);
		return this;
		
	}
	
	public RegisterPage enterText10(String textLoginPassword) {
		enterText(txtLoginPassword, textLoginPassword);
		return this;
	}
	
	public RegisterPage enterText11(String textLoginPasswordCheck) {
		enterText(txtLoginPasswordCheck, textLoginPasswordCheck);
		return this;
		
	}
	public RegisterPage clickCheckBox() {
		clickOnElement(btnCheckBox);
		return this;
		
		
	}
	public LoginPage submitRegister() {
		clickOnElement(btnRegister);
		return new LoginPage(driver, wait);
		
	}
}

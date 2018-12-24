package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest extends Browser{

	HomePage homePage;
	LoginPage loginPage;
	
	String email = "testniEmail@gmail.com";
	String password = "123456";
	String promena = "Nova linija ubacena";
	int brojGrana = 1;
	
	@BeforeClass
	public void beforeClass() {
		Browser.initializeDriver();
		Browser.openURL("http://limocloud.dev.newtec-solutions.com/");
		homePage = new HomePage(Browser.driver, Browser.wait);
		loginPage = new LoginPage(Browser.driver, Browser.wait);
	}
	
	@Test(priority = 1)
	public void register() {	
		homePage
		.switchLanguage()
		.clickRegisterAsMember()
		.enterText("Bla")
		.enterText2("Stefan")
		.enterText3("Blabla")
		.enterText4("safafaqsf")
		.enterText5("dsadasd")
		.enterText6("890890890")
		.enterText8(email)
		.enterText10(password)
		.enterText11(password)
		.clickCheckBox()
		.submitRegister()
		.verifySuccessfulLogin()
		.enterPassword(password)
		.submitLogin();
	}
	
	@Test(priority = 2, dependsOnMethods = "register")
	public void login() {
		loginPage.enterEmail(email)
		.enterPassword(password)
		.submitLogin();
	}
	
	@AfterClass
	public void afterClass() {
		Browser.closeBrowser();
	}
	
}

package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

	//	Elementi
	@FindBy(xpath = "//a[contains(.,'LOGIN')]")
	private WebElement btnLogin;
	@FindBy(xpath = "//ul//a[@href='/members/user_profile']")
	private WebElement btnRegisterAsMember;
	@FindBy(xpath = "//button[@title='Farbe']")
	private WebElement btnColorDropdown;
	@FindAll(@FindBy(xpath = "//ul[@data-filter='color']/li"))
	private List<WebElement> listColorDropdownOption;
	@FindAll(@FindBy(xpath = "//img[@class='thumbnail img-responsive limo']"))
	private List<WebElement> imgList;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement btnDropdown;
	@FindBy(xpath = "//ul[@class='dropdown-menu']/li/a")
	private WebElement btnLanguage;
	
	
	
	//	Konstruktor
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	//	Metode
	public LoginPage clickLogin() {
		clickOnElement(btnLogin);
		return new LoginPage(driver, wait);
	}
	
	public RegisterPage clickRegisterAsMember() {
		clickOnElement(btnRegisterAsMember);
		return new RegisterPage(driver, wait);
	}
	
	public HomePage choseColor(String colorName) {
		// Inicijalizuje Actions builder
		Actions builder = new Actions(driver);
		// Klikce na dugme za dropdown
		clickOnElement(btnColorDropdown);
		// ulazimo u for petlju i prolazimo kroz sve elemente liste
		for(WebElement w : listColorDropdownOption) {
			// proveravamo da li element na kome se trenutno nalazimo
			// ima isti tekst kao tekst koji smo prosledili prilikom 
			// poziva metode
			// !!! Ulazi u if samo ukoliko nadje poklapanje
			if(w.getText().equalsIgnoreCase(colorName)) {
				// pomera se na trazeni element. Skroluje do njega
				builder.moveToElement(w).build().perform();
				// klikce na element
				clickOnElement(w);
				// prekida izvrsavanje for petlje
				break;
			}
		}
		
		return this;
	}
	
	public void chooseCar(String url) {
		for(WebElement w : imgList) {
			if(w.getAttribute("src").contains(url)) {
				System.out.println("Nasao sam auto.\nsrc: " + w.getAttribute("src")
				+ "\ntrazeni tekst je: " + url);
				clickOnElement(w);
				break;
			}
		}
	}
	
	public HomePage switchLanguage() {
		clickOnElement(btnDropdown);
		clickOnElement(btnLanguage);
		return this;
	}


}

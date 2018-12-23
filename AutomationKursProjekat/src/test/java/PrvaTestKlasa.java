import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PrvaTestKlasa {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void test_01() throws InterruptedException {
		//	Naredne tri linije inicijalizuju WebDriver i WebDriverWait
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 5);
		
		//Thread.sleep(5000);
		//	Kazemo drajveru da ide na zadati url
		driver.get("http://limocloud.dev.newtec-solutions.com/");
		
//		//	Kazemo drajveru da saceka da element bude klikabilan
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'LOGIN')]")));
//		//	Inicijalizujemo WebElement od zadatog xPath-a
//		WebElement btnLogin = driver.findElement(By.xpath("//a[contains(.,'LOGIN')]"));
//		//	Klikcemo na element
//		
//		System.out.println(btnLogin.getText());
//		System.out.println(btnLogin.getAttribute("href"));
//		System.out.println(btnLogin.getAttribute("class"));
//		
////		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='nav navbar-nav navbar-left']")));
////		WebElement neuredjenaLista = driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-left']"));
////		System.out.println(neuredjenaLista.findElements(By.xpath("li")));
////		List<WebElement> lista = neuredjenaLista.findElements(By.xpath("li"));
////		lista.get(3).click();
//		//Thread.sleep(10000);
//		
//		if(btnLogin.isDisplayed()) {
//			System.out.println("Login je prikazan na strani.");
//		} else {
//			System.out.println("Login nije prikazan na strani.");
//		}
//		
//		
////		btnLogin.click();
////		//	Kazemo drajveru da saceka da element bude klikabilan
////		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='logInEmail']")));
////		//	Inicijalizujemo WebElement od zadatog xPath-a
////		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='logInEmail']"));
////		//	Upisujemo text u element
////		txtEmail.sendKeys("Ovo radiii!");
////		//	Kazemo drajveru da saceka da element bude klikabilan
////		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='passwort']")));
////		//	Inicijalizujemo WebElement od zadatog xPath-a
////		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='passwort']"));
////		//	Upisujemo text u element
////		txtPassword.sendKeys("Pasvord je upisan.");
////		
////		//	Kazemo drajveru da saceka da element bude klikabilan
////		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='caption profile']")));
////		//	Inicijalizujemo WebElement od zadatog xPath-a
////		WebElement btnLogin2 = driver.findElement(By.xpath("//button[@class='caption profile']"));
////		//	Klikcemo na element
////		btnLogin2.click();
//		
//		driver.quit();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul//a[@href='/members/user_profile']")));
	    WebElement register = driver.findElement(By.xpath("//ul//a[@href='/members/user_profile']"));
	    register.click();
	    
	    Actions builder = new Actions(driver);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
	    WebElement chb = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    builder.moveToElement(chb).build().perform();
	    Thread.sleep(2000);
	    JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	    jsExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", chb, "type", "text");
//		
		
	}
	
}

package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEj {

	public static void main(String[] args) {
		
		//EXPLICIT WAIT le indica al WebDriver que espere x condiciones o un tiempo maximo excedido
		//SOLO APLICA PARA LOS SIGUIENTES ELEMENTOS:
		//alertIsPresent() elementSelectionStateToBe() elementToBeClickable() elementToBeSelected()	frameToBeAvaliableAndSwitchToIt()
		//invisibilityOfTheElementLocated()	invisibilityOfElementWithText()	presenceOfAllElementsLocatedBy() presenceOfElementLocated()
		//textToBePresentInElement() textToBePresentInElementLocated() textToBePresentInElementValue() titleIs()	titleContains()
		//visibilityOf() visibilityOfAllElements()	visibilityOfAllElementsLocatedBy()	visibilityOfElementLocated()
		
		//1. DECLARACION DEL WEBDRIVER
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Drivers" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//2. DECLARACION DE LA ESPERA EXPLICITA		
		WebElement userName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
		
		//RESULTADO CONSOLA: Expected condition failed: waiting for element to be clickable:
		
		//LUEGO DEL LA EXCEPCION SE PUEDE SEGUIR INTERACTUANDO CON LA PAGINA
		userName.sendKeys("Admin");
		
	}

}

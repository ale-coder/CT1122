package seleniumEj;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//standar declarativo para indicarle a Sele el uso del drive
				String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Drivers" + File.separator;
				System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
				
				//variable de control para el driver
				WebDriver driver = new ChromeDriver();
				
				//uso general del driver para que ejecute a la primera
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				
				//Obteniendo objetos o WebElements
				//Declaracion
				WebElement userName = driver.findElement(By.id("txtUsername"));
				WebElement password = driver.findElement(By.id("txtPassword"));
				WebElement btnLogin = driver.findElement(By.id("btnLogin"));
				
				//interaccion con WebElementos
				//login
				userName.sendKeys("Admin");
				Thread.sleep(2000);
				password.sendKeys("admin123");
				Thread.sleep(2000);
				btnLogin.click();
				Thread.sleep(5000);
				
				//findelements;trae toda la lista de los objetos que comparten misma propiedad //Importar la de java.util
				List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
				System.out.println("Numero de elementos" + firstLevelMenu.size());
				String primerMenu = firstLevelMenu.get(0).getText();
				System.out.println(primerMenu);
				String segundoMenu = firstLevelMenu.get(1).getText();
				System.out.println(segundoMenu);
				
				for(int i=0; i<firstLevelMenu.size(); i++) {
					System.out.println("Los menus son: " + firstLevelMenu.get(i).getText());
				}
				
				
				
	}

}

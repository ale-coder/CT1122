package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("test");//
		
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
		
		//metodos del explorador
		//validar por ejemplo si login fue exitoso, tomar un elemento cualquiera dentro de la app despues de login para verificar
		String urlDashboard = driver.getCurrentUrl();
		boolean loginCorrect = urlDashboard.contains("/dashboard"); //Contains es un metodo de java que verifica si un String contiene otro string y regresa booleano
		
		if (loginCorrect) {
			System.out.println("Login correcto");
				}else
					System.out.println("Login incorrecto");
		
		//Metodos de explorador
		//tomar titulo
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);
		
		//metodos del navegador
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//cerrar navegador web
		driver.close();//cierra la ultima
		driver.quit();//cierra todas las ventanas
		
	}

}

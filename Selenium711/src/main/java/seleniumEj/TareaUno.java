package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TareaUno {

	public static void main(String[] args) throws InterruptedException {
	
		//loguearse/directory/buscar nombre Nathan/ jobtitle; sales representative/location: united states/verificar que salga el nombre desplegado

		
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
				
				//Clic en directory
				WebElement directoryclick = driver.findElement(By.id("menu_directory_viewDirectory"));
				directoryclick.click();
				Thread.sleep(1000);
				
				//buscar nombre Nathan
				WebElement directoryName = driver.findElement(By.id("searchDirectory_emp_name_empName"));
				directoryName.sendKeys("Nathan");
				Thread.sleep(3000);
				
				//Seleccionar sales representative de dropout
				Select oSelectJobTitle = new Select (driver.findElement(By.id("searchDirectory_job_title")));
				oSelectJobTitle.selectByVisibleText("Sales Representative");
				Thread.sleep(3000);
				//driver.quit();
				
				//Seleccionar sales United States de dropout
				Select oSelectLocation = new Select (driver.findElement(By.id("searchDirectory_location")));
				oSelectLocation.selectByVisibleText("  United States");
				Thread.sleep(3000);
				//driver.quit();
				
				//Clic en Search
				WebElement searchclick = driver.findElement(By.id("searchBtn"));
				searchclick.click();
				Thread.sleep(1000);
				
				//validar resultado
							
				String validarName = driver.findElement(By.id("resultTable")).getText();
				System.out.println(validarName);
				boolean userMsj = validarName.contains("Nathan");
				if(userMsj) {
					System.out.println("Resultado es Nathan");
						}else {
							System.out.println("El resultado NO ES");
							
						}
	}

}

package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MetodosSelenium2 {

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
		
		//Clic en boton de assign Level de la pagina de prueba
		WebElement assignLeave = driver.findElement(By.className("quickLinkText"));
		assignLeave.click();
		Thread.sleep(3000);
		
		//llenar el textbox de employee name
		WebElement employeeName = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
		employeeName.sendKeys("Alexandra");
		Thread.sleep(3000);
		employeeName.clear();
		
		//verificar elemento desplegado en pagina
		boolean assignBtn = driver.findElement(By.id("assignBtn")).isDisplayed();
		
		if(assignBtn) {
			System.out.println("El boton assign esta desplegado");
		}
		
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		System.out.println(welcomeMsj);
		boolean userMsj = welcomeMsj.contains("Paul");
		if(userMsj) {
			System.out.println("El mensaje de welcome contiene el nombre de Paul");
				}else {
					System.out.println("El mensaje No contiene el nombre de Paul");
					
				}
		//interactuar con dropdown
		Select oSelect = new Select (driver.findElement(By.id("assignleave_txtLeaveType")));
		oSelect.selectByVisibleText("US - FMLA");
		Thread.sleep(3000);
		driver.quit();
		
	}

}

package seleniumEj;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpicitWaitEj {

	public static void main(String[] args) {
		
		// IMPLICIT WAIT es uno de los metodos de Selenium para el control del tiempo en la busqueda fallida de algun elemento
		// Se recomienda declararlo cada que instaciamos el WebDriver

		//1. DECLARACION STANDARD PARA EL DRIVER CHROME
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Drivers" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //variable de control para el driver
		
		//2. Uso del driver
		driver.get("https://opensource-demo.orangehrmlive.com/"); //pagina a localizar
		driver.manage().window().maximize(); //maximizar ventana
			
		//3. DECLARACION DEL IMPLICIT WAIT POR TIME OUT
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//arroja el error despues de 10 segundos, HASTA 30 SEG ES ACEPTABLE O REVISAR TIEMPOS CON EQUIPO CUANDO TIEMPOS SEAN MAYORES
		
		//4. OBTENER UN WEB ELEMENT INVALIDO (FALTA LA LETRA E DE NAME)
		WebElement userName = driver.findElement(By.id("txtUsernam"));
		
		//5. RESULTADO EN CONSOLA "no such element: Unable to locate element Y MUCHAS LINEAS EN ROJO
		//EN CASO DE RESULTADO POSITIVO EN CONSOLA VEMOS EL MENSAJE terminated CON 5 LINEAS DE RESULTADO
		
	}

}

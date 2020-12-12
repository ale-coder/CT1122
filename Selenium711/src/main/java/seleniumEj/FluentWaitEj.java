package seleniumEj;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitEj {

	public static void main(String[] args) {
		
		//FLUENT WAIT indica al WebDriver cuanto tiempo espera un elemento y cada cuanto verifica nuevamente el elemento
		//Se convierte en un metodo dinamico ya que entre los tiempos de espera se puede dar una instruccion como refrescar, de nuevo clic, etc
		//SINCRONIZACION DE ESPERA ARCHIVOS CUALES VAN PRIMERO

		//1. DECLARACION DEL WEBDRIVER
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Drivers" + File.separator;//Setea path del driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//identifica el exe driver
		WebDriver driver = new ChromeDriver();//crea WebDriver mientras ejecuta
		driver.get("https://opensource-demo.orangehrmlive.com/");//abriendo la URL especificada
		driver.manage().window().maximize();//Maximiza ventana
		
		//2. DECLARACION STANDARD DE LA ESPERA FLUENT
		//***IMPORTAR LA LIBRERIA DE JAVA.TIME
		//**mientras no haya un punto y coma se considera como una sola linea de codigo
		//*en estas lineas se puede modificar el tiempo, el web element y la accion de la linea 43 lo demas es standard
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))//esperando 20 segundo a que el elemento este presente en la pagina
				.pollingEvery(Duration.ofSeconds(2))//verificando el elemento cada dos segundos
				.ignoring(NoSuchElementException.class);//la exception que va a evitar durante esos 20 segundos
		
		//3. DECLARACION STANDARD PARA EL WEB ELEMENT CON FLUENT WAIT
		WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				driver.navigate().refresh();//hacer refresh mientras espera
				return driver.findElement(By.id("txtUsernam"));//sin la e para provocar la falla
				}
			
		});
		
		txtUsername.click();
		
	}

}

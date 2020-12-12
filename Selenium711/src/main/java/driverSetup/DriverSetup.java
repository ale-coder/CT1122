package driverSetup;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	//CLASE POM
	//no es main se ejecuta a traves de TestNG

	public static WebDriver setupDriver() { //metodo para ejecutar el driver
		
		
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Drivers" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().window().maximize();
		
		return driver;
	}
	
	
}

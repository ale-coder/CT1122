package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Drivers" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");
	}

}

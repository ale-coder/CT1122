package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_01_CorrectLogin {
	
	//declarar inicializar web driver creando un obj(objeto como tal del tipo webdriver)
	//importandolo desde la clase driversetup CTRL clic sobre setup para ir a la clase
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//Login PageObject crear
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest //ACCIONES ANTES DE INICIAR EL TEST COMO INICIAR EL WEB DRIVER
	
	//metodo que inicia wdriver
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
		
	}
	
	//LOS TEST
	
  @Test
  public void TC_01() {
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	  
  }
  
  @AfterTest
  public void closeDriver() {
	 // driver.quit();
  }
}

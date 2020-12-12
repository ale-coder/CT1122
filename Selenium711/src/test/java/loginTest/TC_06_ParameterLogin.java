package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_06_ParameterLogin {
	
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
	//correr desde una test suite nueva
	
  @Test
  @Parameters({"user","password"}) //IMPORTAR ANNOTATIONS PACKAGE
  public void TC_06(String user, String password) {
	  //sTEP 1 LOGIN
	  login.login(user, password);
	  
  }
  
  @AfterTest
  public void closeDriver() {
	 // driver.quit();
  }
}

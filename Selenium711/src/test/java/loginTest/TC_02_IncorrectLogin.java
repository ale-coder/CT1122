package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.CommonMethods;
import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_02_IncorrectLogin {
	
	
	//LINEA STANDARD
	WebDriver driver = DriverSetup.setupDriver();
	
	//LINEA STANDARD Login PageObject crear
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	//LINEA STANDARD metodo que inicia wdriver
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();

	}
		
	@Test
	public void TC_02() {
	boolean isTrue = login.incorrectLogin(GlobalVariables.USER_ADMIN, "IncorrectPassword"); //CAMBIAR POR admin123 "IncorrectPassword" PARA QUE SALGA EL TEST CORRECTO
	Assert.assertTrue(isTrue);
	  
	}

	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshot(driver, "TC_02_IncorrectLogin");
	  driver.quit();
}
  
}

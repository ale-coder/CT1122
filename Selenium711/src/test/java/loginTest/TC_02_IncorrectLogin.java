package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_02_IncorrectLogin {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//Login PageObject crear
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	//metodo que inicia wdriver
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();

	}
		
	@Test
	public void TC_02() {
	boolean isTrue = login.incorrectLogin(GlobalVariables.USER_ADMIN, "admin123");
	Assert.assertTrue(isTrue);
	  
	}

	@AfterTest
	public void closeDriver() {
	  driver.quit();
}
  
}

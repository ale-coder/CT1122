package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.CommonMethods;
import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;

public class TC_03_Logout {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//Login PageObject crear
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	
	@BeforeTest
	//metodo que inicia wdriver
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();

	}
		
	@Test
	public void TC_03() throws InterruptedException {
	login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	  
	//step 2
	dashboard.logout();
	
	}

	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshot(driver, "TC_03_Logout");
	  driver.quit();
}
	
	//tarea mismo anterior...crear lo necesario en navigation testes
  
}

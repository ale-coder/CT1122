package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	//
	
	//Crear constructor
	
	public DashboardPage(WebDriver driver) { //IMPORTAR WEBDRIVER
		PageFactory.initElements(driver, this);
	}
	
	//OBJETOS DEL DASHBOARD
	
	@FindBy(id="welcome") //ELEMENTO DESDE EL QUE SE HACE LOGOUT
	private WebElement welcomeDrpDwn; //NO ES DROPDOWN PERO POR LLAMARLO DE ALGUN MODO
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[2]/a") //LINK DE LOGOUT IDENTIFICADO CON XPATH NO ESTA LARGO ES UTILIZABLE
	private WebElement logoutBtn;
	
	public void logout() throws InterruptedException { //EL METODO LA ACCION SOLO CLIC EN WELCOME DROPDOWN Y LUEGO CLIC EN LOGOOUT
		Thread.sleep(1000);
		welcomeDrpDwn.click();
		Thread.sleep(1000);
		logoutBtn.click();
	}
	
	
}

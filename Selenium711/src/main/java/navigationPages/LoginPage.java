package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//
	
	//crear constructor, se manda a llamar cada vez que vamos a declarar un objeto de 
	
	public LoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);//inicializamos los webElements con Page Factory
												//This es un keywork con el que estamos indicando 
												//que es la misma clase donde se inicializan los objetos
	}
	
	//Login PageObjects or webelements o elementos de la uai
	//declararlos usando page factory, lo que cambia la forma de declarar
	@FindBy(id="txtUsername")
	private WebElement userNametxt;
	@FindBy(id="txtPassword")
	private WebElement passwordTxt;
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	@FindBy(xpath="//*[@id=\"spanMessage\"]")
	private WebElement errorMessage;
	
	public void login (String user, String password) {
		
		userNametxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean incorrectLogin(String user, String password) {
		userNametxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		boolean msj = errorMessage.getText().contains("Invalid credentials");
		return msj;
	}
	
}

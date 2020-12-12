package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Clase para navegar en la pagina login
	
	//crear constructor, se manda a llamar CON LAS CLASES TESTNG cada vez que vamos a declarar un objeto de la pagina
	
	public LoginPage (WebDriver driver) { //llamar el constructor de la misma manera que la clase //IMPORTAR PACKAGE WEBDRIVER
		
		//DECLARACION STANDARD
		PageFactory.initElements(driver, this);//inicializamos los webElements con Page Factory, Indicandole que va a usar el driver que le enviaremos desde los TEstCases
												//This es un keywork con el que estamos indicando que va iniciar esta pagina la pagina de LOGIN
												//que es la misma clase donde se inicializan los objetos
												//sin esta declaracion la ejecucion falla al no encontrar los elementos de la pagina
	}
	
	//Login PageObjects/Webelements / Elementos de la uai
	//declararlos usando page factory, lo que cambia la forma de declarar
	
	@FindBy(id="txtUsername") //IMPORTAR FINDBY PACKAGE
	private WebElement userNametxt; //privado por encapsuacion para no acceder a traves de cualquier clase //IMPORTAR WEBELEMENT PACKAGE
	@FindBy(id="txtPassword")
	private WebElement passwordTxt;
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	@FindBy(xpath="//*[@id=\"spanMessage\"]")
	private WebElement errorMessage;
	
	
	//METODOS INTERACCION CON ELEMENTOS
	
	public void login (String user, String password) { //dos elementos publico para llamado desde otra clase
		
		userNametxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean incorrectLogin(String user, String password) { //a esta clase accede la clase por ej TestNG TC02 IncorrectLogin
		userNametxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		boolean msj = errorMessage.getText().contains("Invalid credentials");
		return msj;
	}
	
}

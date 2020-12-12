package assertsEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//ASSERTIONS son metodos TestNG para indicar si un TestCase falla o no, al indicarle unos resultados esperados
//HARDASSERT DETIENE LA EJECUCION DEL TEST
//Se usan a traves de las librerias y seteando el POM.xml
//Son ejecutables con la instruccion @Test
//Esta es una class tipo TestNG
//Hard Assertion, puede manejar el error utilizando un bloque de captura como una excepción de Java
//METODOS HARD
//Assert.assertEquals(actual,expected); Assert.assertNotEquals(actual,expected,Message);
 //Assert.assertTrue(condition); Assert.assertFalse(condition);
 //Assert.assertNull(object); Assert.assertNotNull(object);

public class HardAssertEj {
  @Test
  public void assertEquals() { //para Java esto es un metodo pero al crear este tipo de clase TestNG se reconoce ejecutable con el @Test
	  
	  int a = 10; //ejemplo para comparar ints
	  int b = 10;
	  
	  Assert.assertEquals(a,b); //verifica si las variables son iguales
	  
	  							//RESULTADO CONSOLA muestra los totales, corridos, fallados y saltados
	  							//RESULTADO "Results of running method HardAssertEj muestra el detalle del test case ejecutado en verde o azul fallado	  
  }
  
  @Test
  public void assertNotEquals() {
	  int a = 5;
	  int b = 10;
	  Assert.assertNotEquals(a,b);
}
  
  @Test
    public void assertTrue() {
	  int a = 10;
	  int b = 10;
	  Assert.assertTrue(a==b); //retorna boolean
  }
  @Test
  public void verificarTituloDePagina () {
	  
	  //1. Uso del WebDriver
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;
	  System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");//abriendo la URL especificada
	  driver.manage().window().maximize();//maximizar ventana
		
		
	  //2. Variables para interactuar con la pagina
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Orange"; //valor real OrangeHRM
		
	  Assert.assertEquals(actualTitle, expectedTitle);//falla test ya que compara y no encuentra igual los valores
		
  }
  
}

package assertsEj;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//SOFTASSERT permite continuar la ejecucion
//antes de iniciar con los metodos declarar el uso del softassert a diferencia del hard que no se requiere
//los metodos son los mismos del HARD

public class SoftAssertEj {
	
	SoftAssert softAssert = new SoftAssert();//linea mandatoria para poder usar los metodos//IMPORTAR EL PACKAGE
	
  @Test
  public void softAssertEj() {
	  int a = 10;
	  int b = 5;
	  int x = 8;
	  int y = 8;
	 
	  softAssert.assertEquals(a,b);//no son iguales pero continua
	  softAssert.assertEquals(x,y);
	  
	  softAssert.assertAll();//verifica todos los que estan antes
	  
  }
}

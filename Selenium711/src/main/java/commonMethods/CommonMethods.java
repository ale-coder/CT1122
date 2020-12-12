package commonMethods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	public static void takeScreenshot (WebDriver webdriver, String testCaseName) {
		
		//toma el screenshot de la pagina
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE); //IMPORTAR IO package//IMPORTAR TAKESSC...//IMPORT OUTP..
		//Establecer la ruta para guardar las imagenes
		String screenshotPath = Paths.get("").toAbsolutePath().toString()+ File.separator + "test-output" + File.separator + "ExecutionResult";
				
		
		try {
		//creamos el folder usando la ruta especificada en la variable "screenshot"
		FileHandler.createDir(new File(screenshotPath));//IMPORTAR TRHOUGH DECLARATION NOOOOOO MEJOR TRY CATH
		//copiar el screenshot generado en el objeto "scrFile" a la ruta especificada en "screenshot"
		FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}		
				
	}
	

}

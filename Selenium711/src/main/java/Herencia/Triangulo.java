package Herencia;

public class Triangulo extends DosDimensiones{ //Al decir extends quiere decir que es subclase de DosDimensiones
	
	String estilo; //variable de esta clase
	
	//este metodo no se define como publico ya que se va a usar solo dentro del package
	double area() { //regresa un calculo se usa double por que la division puede devolver decimales
		return base*altura/2; //las variables ya estan definidas en la clase Padre que se las comparte
		
	}
	
	void mostrarEstilo () { //void porque no tiene return
		System.out.println("Triangulo es : " + estilo); //
		
		
	}

}

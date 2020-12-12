package Herencia;

public class Lados3 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		Triangulo t1 = new Triangulo (); //instancias de la clase triangulo SINTAXISnombre clase +  variable = nueva clase de..y apertura y cierre
		Triangulo t2 = new Triangulo (); //Ejemplo para polimorfismo
		
		t1.base = 4.0; //a la instancia le add la variable base heredada de DosDimensiones
		t1.altura = 4.0; //a la instancia le add la variable base heredada de DosDimensiones
		t1.estilo = "Estilo 1"; //a la instancia le add la variable base heredada de Triangulo es un string
		
		System.out.println("Informacion para T1: "); //IMPRIME "Informacion para T1: "
		t1.mostrarEstilo(); //acceder al metodo mostrar de la clase Triangulo //IMPRIME Triangulo es: Estilo 1
		t1.mostrarDimension(); //acceder al metodo mostrar de la clase DosDimensiones //IMPRIME "La base y altura es: 4.0 Y 4.0"
		System.out.println("Su area es : " + t1.area()); //t1 la instancia con el metodo area de triangulo //IMPRIME "Su area es: 6.0"
		
		System.out.println();
		
		//polimorfism		
		t2.base = 8.0;
		t2.altura = 12.0;
		t2.estilo = "Estilo 2";
		
		System.out.println("Informacion para T2: ");
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es : " + t2.area());
		
					

	}

}

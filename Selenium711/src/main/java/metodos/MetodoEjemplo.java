package metodos;

public class MetodoEjemplo {

	public static void main(String[] args) {
		//El metodo indica las instrucciones dentro de una clase
		//Inicia y finaliza con llave o para cerrar tambien con return
		//No acepta metodo dentro de otro metodo
		//puede llevar uno o mas parametros
		//El metodo se puede mandar a llamar
		//Si se invoca otro metodo que retorna un int es por que el met esta escrito para recibir el mismo tipo de dato	
		//USABILIDAD ejemplo un metodo para llamar los datos de un login que siempre son los mismos
		//USABILIDAD si se modifica algun elemento de una pagina de login se adicional en el metodo y al ser invocado el cambio seria automatico en toda el programa 
		
		int resultado = suma(4,7);//llamado el metodo suma, recibe un int y por ello la variable es int
		System.out.println(resultado);
		
		int resultado2 = suma(134,14,15);
		System.out.println(resultado2);
		
		String marca = carro(3); //invocacion del metodo carro que obtiene la posicion 3 del arreglo
		System.out.println(marca); //IMPRIME: mazda
		
		
	}

	public static int suma(int a, int b) {//definicion del metodo, por si solo no hace nada, se debe mandar a llamar en el main
		int c = a + b;
		return c;
	}
	
	//SOBRECARGA DE METODO
	
	public static int suma (int a, int b, int c) { //recibe varios enteros // usa esta esta variable que es la que tiene 3 inputs = int resultado2 = suma(134,14,15);
		
		int d = a + b + c;
		return d; //retorna 163
		
	}
	
	//Metodo tipo string
	
	public static String carro(int a ) { //Recibe un entero que indica la posicion del arreglo a retornar
		String [] cars = {"volvo", "BMW", "Ford", "mazda"}; //arreglo con valores tipo string
		return cars[a]; //devuelve el string de la posicion del valor a, como entero recibido 
		
	}
}

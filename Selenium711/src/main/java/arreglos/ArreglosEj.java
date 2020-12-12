package arreglos;

public class ArreglosEj {

	public static void main(String[] args) {
		//Guarda valores mas comunmente Strings
		// Se usa por ejemplo para almacenar los elementos de una pagina, lo mas comun es que se use un arreglo pequeni pero en caso de ser muy grande se puende meter en un for
		//en Java los arreglos siempre comienzan en 0
		
		byte byteArray [];
		boolean booleanArray [];
		long longArray [];
		float floatArray [];
		double doubleArray [];
		char charArray [];
		
		int intArray []; //una forma de declarar //como buena practica se pone intArray para cuando se use no ir a buscar que tipo es sino saberlo con el nombre
		int [] intArray2; //otra forma de declarar
		
		short shorArray[];// define que el arrray recibira por ejemplo un entero con signo
		String array []; //define que el arreglo recibira cadena de valores
		
		array = new String[5]; //asignacion memoria para 5 strings
		
		array[0] = "cero"; //asignacion de valores
		array[1] = "uno";
		array[2] = "dos";
		array [3] = "tres";
		array [4] = "cuatro";
		
		//System.out.println("Elemento de la posicion 1: " + array[1]); //IMPRESION: "Elemento de la posicion 1: uno"
		//System.out.println("Elemento de la posicion 3: " + array[3]); 
		
		for (int i = 0; i < array.length; i++){//Forloop es un bucle, condiciones para que ejecute haste completar un valor
			// i es una variable declarada internamente dentro del for para poder recorrer y arranca desde la posicion 0
			// la ";" indica mientras sea menor a la longitud del arreglo se aumente el valor de i
			// length es un metodo por defecto de java
			// Este for regresa la longitud del arrego. 
			// Se puede usar un for en caso que el arrego sea muy grande y con poco codigo
				
		System.out.println("Elemento en el indice " + i + ":" + array[i]);//va imprimiento la posicion del i
		//IMPRESION: "Elemento en el indice 0: Cero"
		//IMPRESION: "Elemento en el indice 1: Uno"
		//IMPRESION: "Elemento en el indice 2: Dos"
		//IMPRESION: "Elemento en el indice 3: Tres"
		//IMPRESION: "Elemento en el indice 4: Cuatro"
		
		//ejemplo arreglo sin especificar el tamaño de manera dinamica agregamos valores
		// int[] intArrayDinamico = new int [] {11,2,30,4,5,6,8,12};
		}
		

	}

}

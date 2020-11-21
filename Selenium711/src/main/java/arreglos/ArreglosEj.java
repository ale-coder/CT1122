package arreglos;

public class ArreglosEj {

	public static void main(String[] args) {
		// Se usa por ejemplo para almacenar los elementos de una pagina, lo mas comun es que se use un arreglo pequeni pero en caso de ser muy grande se puende meter en un for
		
		int intArray [];
		int [] intArray2;
		
		short shorArray[];
		String array []; //declaracion de array
		
		array = new String[5]; //asignacion memoria para 5 strings
		
		array[0] = "cero";
		array[1] = "uno";
		array[2] = "dos";
		array [3] = "tres";
		array [4] = "cuatro";
		
		//System.out.println("Elemento de la posicion 1: " + array[1]);
		//System.out.println("Elemento de la posicion 3: " + array[3]);
		
		for (int i = 0; i < array.length; i++){//regresa la longitud del arrego. Se puede usar un for en caso que el arrego sea muy grande y solo se utiliza poco codigo
				
		System.out.println("Elemento en el indice" + i + ":" + array[i]);//valor i dentro del forloop
		
		//ejemplo declarar arrego dinamico, no especificamos memoria
		}// int [] intArrayDinamico = new int [] { 1,2,3,4,5,6,8,12};
		

	}

}

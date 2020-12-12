package arreglos;

public class ArregloMultiEj {

	public static void main(String[] args) {
		// Multi es un arreglo dentro de otro arreglo
		// usabilidad por ejemplo respuesta de apis ya que las apis generan muchas respuestas del json por ej.
		// es poco usado
		
		int arr [][] = {{2,7,9}, {3,6,1}, {7,4}};// Declaracion de array. Las dos llaves indican dos dimensiones (unos o mas dentro de otro)
		// tres arreglos separados por la coma dentro de los corchetes
		
		//System.out.println(arr[2][1]); // IMPRIME DEL ARREGLO DOS LA POSICION 1 = 4 //RECORDAR POSICIONES INICIALES SIEMPRE EN 0
		//System.out.println(arr[0][0]); // IMPRIME = 2
		//System.out.println(arr[1][2]); // IMPRIME = 1
		
		// SE REQUIEREN DOS FOR 
		//for (int i = 0; i < 3; i++) { // uno para recorrer los arreglos que son 3
			//for (int j = 0; j < 3; j++) { // otro para recorrer parte interna de cada arreglo que son 3 posiciones para cada uno
		//     System.out.println(arr[i][j] + " "); //print en la misma linea 
		//IMPRIME
		//2 7 9
		//3 6 1
		//7 4 2
		
		
		//en caso de no ingresar el valor exacto del tamaño, si no dinamicamente
			for (int i =0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Arreglo multi posicion " +i+ ","+ j + ": " + arr[i][j]); //print en la misma linea
				//IMPRIME
				//Arreglo multi posicion 0,0: 2
				//Arreglo multi posicion 0,1: 7
				//Arreglo multi posicion 0,2: 9

				//Arreglo multi posicion 1,0: 3
				//Arreglo multi posicion 1,1: 6
				//Arreglo multi posicion 1,2: 1

				//Arreglo multi posicion 2,0: 7
				//Arreglo multi posicion 2,1: 4
				
			}
				System.out.println(); // solo para visualizar mejor el resultado deja espacio entre el R/ de los arreglos
		}

	}

}

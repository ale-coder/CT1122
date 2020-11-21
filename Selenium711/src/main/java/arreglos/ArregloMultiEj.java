package arreglos;

public class ArregloMultiEj {

	public static void main(String[] args) {
		// Multi es un arreglo dentro de otro arreglo, uso por ejemplo respuesta de apis ya que eran muchas respuestas
		
		int arr [][] = {{2,7,9},{3,6,1}, {7,4,2}};
		
		//System.out.println(arr[2][1]);
		//System.out.println(arr[0][0]);
		//System.out.println(arr[1][2]);
		
		//para recorrer un for para y otro for para iterar es decir sumar una posicion para el rrecorrido
		
		// hace el for una vez luego otras tres veces y luego otras tres
		//for (int i =0; i < 3; i++) {
			//for (int j = 0; j < 3; j++) {
		//     System.out.println(arr[i][j] + " "); //print en la misma linea
			for (int i =0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Arreglo multi posicion " +i+ ","+ j + ": " + arr[i][j]); //print en la misma linea
			}
				System.out.println();
		}

	}

}

package clasesYObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// aca se crea la instancia de la clase vehiculo
		//se asignan valores de los objetos
		
		
		Vehiculo minivan = new Vehiculo(); //creacion de instancia minivan por ejemplo, Manera general para llamar metodos y obj de otra clase 
		
		int rango; //creacion de una variable cualquiera para hacer un calculo
		
		minivan.pasajeros = 9; //utilizar los objetos de la clase. al digitar minivan. aparecen los objetos que tiene la clase
		minivan.capacidad = 15; //se asignan valores para hacer algun tipo de calculo
		minivan.kmh = 20;
		
		//calcular el rango
		
		rango = minivan.capacidad * minivan.kmh; //calculo
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
		//los "+" en la inpresion indican la cadena de valores
		//IMPRESION "La minivan puede llevar 9 pasajeros con un rango de 300 kilometros"

	}

}

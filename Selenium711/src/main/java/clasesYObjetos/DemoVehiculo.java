package clasesYObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// aca se crea la instancia de la clase vehiculo
		//se asignan valores de los objetos
		
		
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//calcular el rango
		
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("la minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");

	}

}

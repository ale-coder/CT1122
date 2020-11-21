package metodos;

public class MetodoEjemplo {

	public static void main(String[] args) {
		// metodo dentro de otro metodo
		//llamar el metodo // tener en cuenta que si mando a llamar un int es por que el met regresa un integer y asi con un string
		// ejemplo un metodo para llamar un login con los que tenga user pawwor login id para login y si cambia el boton de esta manera facilitamos cambiando en un solo punto 
		
		int resultado = suma(4,7);
		System.out.println(resultado);
		
		int resultado2 = suma(134,14,15);
		System.out.println(resultado2);
		
		String marca = carro(3);
		System.out.println(marca);
		
		
	}

	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//SOBRECARGA DE METODO
	
	public static int suma (int a, int b, int c) {
		
		int d = a + b + c;
		return d;
		
	}
	
	//tipo string enviando entero "a"
	
	public static String carro(int a ) {
		String [] cars = {"volvo", "BMW", "Ford", "mazda"};
		return cars[a];
		
	}
}

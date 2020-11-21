package encapsulamiento;

public class EncapEjemplo {

	public static void main(String[] args) {
		// no interactuar directamente con el objeto
		
		Miclase miclase = new Miclase();
		
		miclase.setTipo(10); //asigno valor
		System.out.println("El tipo es: " + miclase.getTipo()); // me trae valor
		

	}

}

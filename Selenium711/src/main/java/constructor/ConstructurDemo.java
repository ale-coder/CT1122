package constructor;

public class ConstructurDemo {

	public static void main(String[] args) { //METODO MAIN PORQUE ES EL QUE SE EJECUTA Y PUBLICO PARA PODER LLAMARLO
		
		
		
		ConstructorEj t1 = new ConstructorEj(); //se llama a la clase, se declara una variable que indica el uso del contructor
		ConstructorEj t2 = new ConstructorEj();
		
		System.out.println(t1.x); //IMPRIME 10
		System.out.println(t2.x); //IMPRIME 10 // cada que se llame vale lo mismo
				

	}

}

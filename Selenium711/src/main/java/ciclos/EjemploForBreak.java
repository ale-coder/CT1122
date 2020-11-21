package ciclos;

public class EjemploForBreak {

	public static void main(String[] args) {
		// solo a dos primeras opciones en check box que por ejemplo tiene 5

		for (int x = 0; x< 10; x++){
			if (x==5) {
				break;
			}
			System.out.println("X:"+x);
		}
		
	}

}

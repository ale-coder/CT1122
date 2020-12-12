package tiposDeDatos;

public class variables {

	public static void main(String[] args) {
		// Operadores Aritméticos (+,  -,  *, /, %)
		// Operadores Unarios (+, -, ++, --, !)
		// Operadores  Relacionales (==, !=, >, >=, <, <=)
		// Operadores condicionales (&&, ||) AND OR
		// Operadores de Bit (&, ^, |, ~)
		
		//Byte 1 byte.. tres digitos rango -128 a 127
		//Short 2 bytes rango -32768 + 32767
		//int 4 bytes -2147483648 +2147483647
		//long 8bytes -9223372036854775808 +9223372036854775807
		//Double 8 bytes rango 1.8*10 a la 308
		//Float 4 bytes 3.14*10 a la 38


		float simpleInt;
		simpleInt = 1.1f;
		
		int time = 10, speed = 20;
		
		int suma = time + speed;
		
		int time2 = ++time; //incrementa uno
		
		char var = 'h';
		
		String caracteres = "valor inicial despues del ejemplo";
		System.out.println(caracteres);
		caracteres = "valor modificado";
		System.out.println(caracteres);
		
	}

}

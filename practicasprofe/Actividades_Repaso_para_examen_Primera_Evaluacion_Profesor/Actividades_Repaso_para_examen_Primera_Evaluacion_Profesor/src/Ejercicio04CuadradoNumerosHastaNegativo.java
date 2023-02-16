import java.util.Scanner;

public class Ejercicio04CuadradoNumerosHastaNegativo {

	public static void main(String[] args) {
		/*
		 * Leer un número y mostrar su cuadrado, repetir el proceso hasta
		 * que se introduzca un número negativo.
		 */
		
		Scanner leer = new Scanner(System.in);
		int numero = 0;
		/*
		 * 1.- pido el numero
		 * 2.- meto un while : pintar y leer
		 * 3.- cierro el programa
		 */
		/*
		 * leer numero
		 */
		System.out.println("dame un numero entero, negativo para terminar");
		numero = leer.nextInt();
		
		while (numero >= 0) {
			System.out.println("el cuadrado es : "+ (int)Math.pow(numero, 2));
			
			/*
			 * y volver a leer
			 */
			System.out.println("dame un numero entero, negativo para terminar");
			numero = leer.nextInt();
		}
		System.out.println("FIN DEL PROCESO");
		leer.close();

	}

}

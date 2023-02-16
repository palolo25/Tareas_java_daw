import java.util.Scanner;

public class Ejercicio07CuantasCifras {

	public static void main(String[] args) {
		/*
		 * Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		 */
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero entero, maximo 2 Gbytes");
		int numero = leer.nextInt();
		
	//	String numeroString = String.valueOf(numero);
		System.out.println("El numero introducido tiene : " 
				+ String.valueOf(numero).length() + "\tcifras");
		
		leer.close();
	}

}

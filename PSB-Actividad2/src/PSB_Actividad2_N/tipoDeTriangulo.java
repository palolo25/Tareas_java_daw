package PSB_Actividad2_N;

import java.util.Scanner;

public class tipoDeTriangulo {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int l1, l2, l3;

		System.out.println("Primer lado: ");
		l1 = leer.nextInt();
		System.out.println("Segundo lado: ");
		l2 = leer.nextInt();
		System.out.println("Tercer lado: ");
		l3 = leer.nextInt();
		// Triangulo equilatero

		if ((l1 == l2) && (l2 == l3)) {
			System.out.println("Es un triangulo equilatero");
		}
		// Triangulo isosceles

		if ((l1 == l2) && (l2 != l3) || (l2 == l3) && (l3 != l1) || (l1 == l3) && (l3 != l2)) {
			System.out.println("Es un triangulo isosceles");
		}
		// Triangulo escaleno

		if ((l1 != l2) && (l1 != l3) && (l2 != l3) && (l2 != l1) && (l3 != l2) && (l3 != l1)) {
			System.out.println("Es un triangulo escaleno");
		}


	}

}
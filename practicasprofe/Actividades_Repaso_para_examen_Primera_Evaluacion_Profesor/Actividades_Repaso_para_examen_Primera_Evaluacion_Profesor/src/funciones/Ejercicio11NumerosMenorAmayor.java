package funciones;

public class Ejercicio11NumerosMenorAmayor {
/*
 * Función a la que se le pasan dos enteros y muestra todos los
 * números comprendidos entre ellos, inclusive, siempre de menor a mayor). 
 */
	public static void main(String[] args) {
		mostrarNumeros(1, 7);
		System.out.println("OTRA RISTRA");
		mostrarNumeros(5, 1);
		
		System.out.println("LOS DOS IGUALES");
		mostrarNumeros(5, 5);

	}
	
public static void mostrarNumeros(int num1, int num2) {
		
		int mayor=num2, menor= num1;
		
		if (num1 > num2) {
			menor = num2;
			mayor=num1;
		}
		
		for (int i= menor; i<=mayor; i++) {
			System.out.println(i);
		}
			
	}

}

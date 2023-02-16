import java.util.Scanner;

public class Ejercicio05NumerosHastaCeroConEstadisticas {
/*
 * Leer números hasta que se introduzca un 0. Para cada uno indicar 
 * si es par o impar. Y al final del proceso, escribir cuantos son pares e 
 * impares y cuanto suman los pares y los impares. 
 */
	public static void main(String[] args) {
		int numeroLeido = 0, cuantosPares = 0, 
				cuantosImpares = 0, sumaPares = 0, sumaImpares = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero entero, 0 para terminar");
		numeroLeido = leer.nextInt();
		while (numeroLeido != 0) {
			if (numeroLeido %2 == 0) {
				cuantosPares++;
				sumaPares += numeroLeido;
			}else {
				cuantosImpares++;
				sumaImpares += numeroLeido;
			}
			
			System.out.println("Introduce un numero entero, 0 para terminar");
			numeroLeido = leer.nextInt();
		}
		
		/*
		 * Estadisticas
		 */
		
		System.out.println("Han salido " + cuantosPares + "\tnumeros pares");
		System.out.println("Han salido " + cuantosImpares + "\tnumeros impares");
		System.out.println("La suma de los pares son " + sumaPares);
		System.out.println("La suma de los impares son " + sumaImpares);
								
				
		leer.close();

	}

}

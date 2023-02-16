
public class Ejercicio03DiezPrimerosImpares {
/*
 * Diseñar un programa que muestre el producto de los 10 primeros 
 * números impares. 
 */
	public static void main(String[] args) {

		int contador = 1, impar = 1;
		
		while(contador <= 10) {
			System.out.println("impar : " + impar);
			impar +=2;
			contador++;
			
		}
		
		System.out.println("Fin PROGRAMA");
	}

}

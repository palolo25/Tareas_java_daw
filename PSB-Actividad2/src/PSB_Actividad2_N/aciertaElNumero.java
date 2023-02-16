package PSB_Actividad2_N;

import java.util.Random;
import java.util.Scanner;

public class aciertaElNumero {

	public static void main(String[] args) {
		
		Random nr = new Random();
		
		int nrandom = nr.nextInt(40);
		
		int numero;
		
		int i;
		
		System.out.println("Escriba un numero");
		System.out.println("Elige un numero del 1 al 40");
		
		for(i=1;;i++) {
			
			Scanner leer = new Scanner(System.in);
			
			numero = leer.nextInt();
			
			if(nrandom < numero) {
				System.out.println("El numero es menor intenta de nuevo "+numero);
			}else if(nrandom>numero) {
				
				System.out.println("El numero es mayor intenta de nuevo "+numero);
			}else if(nrandom == numero) {
				
				System.out.println("Este es el numero correcto bien hecho "+numero + " Numero de intentos "+ i );
			}else if (numero < 1){
				
				System.out.println("NUMERO FUERA DEL RANGO INTENTA DE NUEVO");
				
				
			}
			
		}
		

	}

}

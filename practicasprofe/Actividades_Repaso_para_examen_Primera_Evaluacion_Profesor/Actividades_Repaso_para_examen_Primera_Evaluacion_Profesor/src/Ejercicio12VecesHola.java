import java.util.Scanner;

public class Ejercicio12VecesHola {

	public static void main(String[] args) {
		int veces = 0;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("dame un numero, te voy a ......");
		veces = leer.nextInt();
		saludarMuchasVeces(veces);
		leer.close();
	}
	
		public static void saludarMuchasVeces(int veces) {	
		for (int i = 1; i<= veces; i++)
			System.out.println("Hola");
	}	
		
		

	 

}

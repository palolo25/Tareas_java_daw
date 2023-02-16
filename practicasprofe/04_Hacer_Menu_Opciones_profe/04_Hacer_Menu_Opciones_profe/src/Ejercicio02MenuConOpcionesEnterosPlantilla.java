import java.util.Scanner;

public class Ejercicio02MenuConOpcionesEnterosPlantilla {

	private static   Scanner leer;
	
	
	static {
		leer = new Scanner(System.in); 
		
	}
	
	public static void main(String[] args) {
		
		int opcion = 0, num1 = 0, num2 = 0;
		opcion = pintarMenu();
		
		while (opcion != 5) {
			
			System.out.println("teclea dos numeros");
			num1= leer.nextInt();
			num2 = leer.nextInt();
			
			switch(opcion) {
			case 1:
				procesarCase1(num1,num2);
				
				break;
			case 2:
				procesarCase2(num1,num2);
				break;
			case 3:
				procesarCase3(num1,num2);
				break;
			case 4:
				procesarCase4(num1,num2);
				break;
			default:
				System.out.println("opcion erronea");
				break;
			
		
		}
			opcion = pintarMenu();
		}
		
		System.out.println("FIN DE PROGRAMA");
	}
	
	public static  void procesarCase1(int op1, int op2) {
		System.out.println("tratamiento case 1");
	}
	
	public static  void procesarCase1(double op1, double op2) {
		System.out.println("tratamiento case 1 sobrecargado");
	}
	
	public static void procesarCase2(int op1, int op2) {
		System.out.println("tratamiento case 2");
	}
	
	public static void procesarCase3(int op1, int op2) {
		System.out.println("tratamiento case 3");
	}
	
	public static void procesarCase4(int op1, int op2) {

		System.out.println("tratamiento case 4");
	}
	
	
	
	public static int pintarMenu() {
		
		int opcion = 0;
		
		System.out.println("1.- Sumar");
		System.out.println("2.- restar");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Salir");
		
		System.out.println("teclea una opcion del 1 al 4, 5 para salir");
		opcion = leer.nextInt();
		
		while(opcion < 1 || opcion > 5) {
			System.out.println("opciones del 1 al 5");
			opcion = leer.nextInt();
		}
		
		return opcion;
	}

}

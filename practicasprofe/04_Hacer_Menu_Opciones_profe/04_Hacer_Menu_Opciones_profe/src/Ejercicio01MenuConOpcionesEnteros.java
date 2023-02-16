import java.util.Scanner;

public class Ejercicio01MenuConOpcionesEnteros {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opcion = 0, num1 = 0, num2 = 0;
		opcion = pintarMenu();
		while (opcion != 5) {
			
			System.out.println("teclea dos numeros");
			num1= leer.nextInt();
			num2 = leer.nextInt();
			
			switch(opcion) {
			case 1:
				sumar(num1,num2);
				
				break;
			case 2:
				restar(num1,num2);
				break;
			case 3:
				multiplicar(num1,num2);
				break;
			case 4:
				dividir(num1,num2);
				break;
			default:
				System.out.println("opcion erronea");
				break;
			
		
		}
			opcion = pintarMenu();
		}
		
		System.out.println("FIN DE PROGRAMA");
	}
	
	public static  void sumar(int op1, int op2) {
		int resultado = 0;
		resultado = op1 + op2;
		System.out.println("la suma es : " + resultado);
	}
	
	public static  void sumar(double op1, double op2) {
		double resultado = 0;
		resultado = op1 + op2;
		System.out.println("la suma de doubles es  : " + resultado);
	}
	
	public static void restar(int op1, int op2) {
		System.out.println("la resta es : " + (op1-op2));
	}
	
	public static void multiplicar(int op1, int op2) {
		System.out.println("la multiplicacion es : " + (op1*op2));
	}
	
	public static void dividir(int op1, int op2) {
		if (op2 == 0)
			System.out.println("división imposible");
		else
			System.out.println("la division es : " + (op1/op2));
	}
	
	
	
	public static int pintarMenu() {
		Scanner leer = new Scanner(System.in);
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

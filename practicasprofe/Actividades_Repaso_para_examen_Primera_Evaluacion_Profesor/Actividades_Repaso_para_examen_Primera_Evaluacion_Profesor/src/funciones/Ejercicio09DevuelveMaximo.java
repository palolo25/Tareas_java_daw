package funciones;

public class Ejercicio09DevuelveMaximo {

	public static void main(String[] args) {
		System.out.println(maximoDeDosNumeros(7, 8));
		System.out.println(maximoDeDosNumeros(9, 8));
		System.out.println(maximoDeDosNumeros(7, 7));
		
		

	}
	
	public static int maximoDeDosNumeros(int op1, int op2) {
		
		if (op1 > op2)
			return op1;
		if (op2 > op1)
			return op2;
		return op1;
	}

}

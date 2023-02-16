package funciones;

public class Ejercicio10MaximoDeTres {

	public static void main(String[] args) {
		System.out.println(maximoDeTresNumeros(7, 8, 9));
		System.out.println(maximoDeTresNumeros(7, 7, 9));
		
		System.out.println(maximoDeTresNumeros(2,4, 3));
		System.out.println(maximoDeTresNumeros(2,4, 2));
		
		System.out.println(maximoDeTresNumeros(8, 7,6));
		System.out.println(maximoDeTresNumeros(8, 7,7));
		
		System.out.println(maximoDeTresNumeros(5, 5,5));
		
		
		

	}
	
	public static int maximoDeTresNumeros(int n1, int n2, int n3) {
		
		if (n1 >= n2 && n1 >= n3)
			return n1;
			
		else
			if (n2 >= n3 && n2 >= n1)
				return n2;
			else
				return n3;

	}

}


public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		 */
		int numero = 45678987;
		
	//	String numeroString = String.valueOf(numero);
		System.out.println(String.valueOf(numero).length());
		
		String cadena = "";
		
		cadena += 2;
		cadena += 24;
		System.out.println(cadena);
		
		System.out.println("El binario de 0 es : " + binario(0));
		
		

	}
	
	public static String binario(int numero) {
			
		String cadena = "", reverse= "";
		int cociente =0;
		if (numero == 0)
			return cadena +=0;
		if (numero == 1)
			return cadena += 1;
		cociente = numero/2;
		cadena += numero%2;
		while (cociente != 1) {
			cadena += cociente%2;
			cociente /= 2;
		}
		
		cadena += 1;
		
		
		
		for (int i = cadena.length()-1; i >= 0; i--)
			reverse += cadena.charAt(i);
		
		return reverse;
	}

}

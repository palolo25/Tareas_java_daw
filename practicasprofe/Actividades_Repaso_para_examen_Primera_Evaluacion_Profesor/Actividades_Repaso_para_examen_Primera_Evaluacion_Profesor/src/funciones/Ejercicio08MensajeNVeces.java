package funciones;

public class Ejercicio08MensajeNVeces {

	public static void main(String[] args) {
		int cuantasVeces = 7;
		mensajes(cuantasVeces);

	}
	
	public static void  mensajes(int veces) {
		
		for (int i= 1; i<= veces; i++) {
			System.out.println(i+".- Módulo ejecutándose");
		}
		
	}

}

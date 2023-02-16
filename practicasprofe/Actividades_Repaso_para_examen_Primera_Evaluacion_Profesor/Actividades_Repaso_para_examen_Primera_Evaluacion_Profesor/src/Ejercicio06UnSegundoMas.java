
public class Ejercicio06UnSegundoMas {
/*
 * Pedir una hora de la forma hora, minutos y segundos, y mostrar la 
 * hora en el segundo siguiente (HORAS DE O A 23, MINUTOS DE 0 A
 * 59 Y SEGUNDOS DE 0 A 59). 
 */
	public static void main(String[] args) {
		//datos de prueba
		int hora = 23,  minuto = 59, segundo = 59;
		
		// algoritmo
		if (segundo <= 58)
			segundo++;
		else
		{
			segundo = 0;
			if (minuto <= 58)
				minuto++;
			else {
				minuto = 0;
				if (hora < 23)
					hora++;
				else
					hora=0;
			}
		}
		
		
		System.out.println("Nueva Hora "+ hora + ":" + minuto + ":" + segundo);

	}

}

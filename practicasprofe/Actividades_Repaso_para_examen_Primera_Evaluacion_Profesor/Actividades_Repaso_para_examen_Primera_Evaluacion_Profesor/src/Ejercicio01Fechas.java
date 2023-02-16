

import utilitys.CosasUtiles;
/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta 
 * (los años que terminan en 00 no son bisiestos) 
 */
public class Ejercicio01Fechas {
	private static final String FECHA_CORRECTA = "fecha correcta";
	private static final String FECHA_INCORRECTA = "fecha incorrecta";
	

	public static void main(String[] args) {
		int dia = 29, mes=2, anio = 2000;
		/*
		 * he creado una clase CosasUtiles con un método static 
		 * que calcula la fecha.
		 * Al final de esta clase está el switch comentado que hace lo mismo
		 */
		if (CosasUtiles.validarFecha(anio, mes, dia) )
			System.out.println(FECHA_CORRECTA);
		else
			System.out.println(FECHA_INCORRECTA);
	/*	
		switch(mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				if (dia >= 1 && dia <= 31)
					System.out.println(FECHA_CORRECTA);
				else
					System.out.println(FECHA_INCORRECTA);
				break;
				
			case 4: case 6: case 9: case 11: 
				if (dia >= 1 && dia <= 30)
					System.out.println(FECHA_CORRECTA);
				else
					System.out.println(FECHA_INCORRECTA);
				break;
			 
			case 2: 
				if (dia >= 1 && dia <= 28)
					System.out.println(FECHA_CORRECTA);
				else
					if (dia == 29 && anio % 100 == 0)
						System.out.println(FECHA_INCORRECTA);
					else
						if (dia == 29 && anio % 4 == 0 )
							System.out.println(FECHA_CORRECTA);
						else
							System.out.println(FECHA_INCORRECTA);
				break;
			default:
				System.out.println(FECHA_INCORRECTA);
				
		}
*/
	}

}

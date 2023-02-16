package utilitys;

public class CosasUtiles {
	

	public static boolean validarFecha(int anio, int mes, int dia) {
		 
		
		
		switch(mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				if (dia >= 1 && dia <= 31)
					return true;
				else
					return false;
				
				
			case 4: case 6: case 9: case 11: 
				if (dia >= 1 && dia <= 30)
					return true;
				else
					return false;
				 
			 
			case 2: 
				if (dia >= 1 && dia <= 28)
					return true;
				else
					if (dia == 29 && anio % 100 == 0)
						return false;
					else
						if (dia == 29 && anio % 4 == 0 )
							return true;
						else
							return false;
				 
			default:
				return false;
				
		}

	}

}

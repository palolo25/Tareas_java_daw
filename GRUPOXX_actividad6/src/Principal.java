
public class Principal {

	public static void main(String[] args) {
		
		Profesor profesor1 = new Profesor("516632211R", "Carlos Robles", "C/ pez volador","616669922","Matematicas y lengua");
		Alumno alumno1 = new Alumno("532224411R", "Alicia Torres", "C/ Luna Lunera", "639889999", "1� Bachillerato");
		Administrativo administrativo1 = new Administrativo("123454411A", "Rosa Torres", "C/ Luna Lunera ", "639889999", "Hacer matriculas, controlar asistencia");
		
		System.out.println(profesor1.toString());
		profesor1.trabajar();
		System.out.println("\n");
		System.out.println(alumno1.toString());
		alumno1.trabajar();
		System.out.println("\n");
		System.out.println(administrativo1.toString());
		administrativo1.trabajar();
		System.out.println("\n");
		System.out.println(alumno1.llamar(profesor1));
		System.out.println("\n");
		System.out.println(profesor1.ponerNotas());
		System.out.println(alumno1.hacerExamen());
		System.out.println(administrativo1.gestionarMatricula());
		
		
		
	}

}

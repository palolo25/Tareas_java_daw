package PSB_Actividad2_N;

import java.util.Scanner;

public class HyMyNivelAdquisitivo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;

        int contadorPersonas = 0;
        double acumulador = 0;

        do {
            System.out.println("Cual es tu nombre: ");
            nombre = entrada.next();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            contadorPersonas++;
            System.out.println("Cual es tu sexo Hombre h o H o mujer m o M: ");
            String sexo;
            sexo = entrada.next();
            System.out.println("Su sexo es: " + sexoPersona(sexo.charAt(0)));
            System.out.println("Cuanto es sus salario medio: ");
            double salMedio;
            salMedio = entrada.nextDouble();
            acumulador += salMedio;
            System.out.println("Su salario es: " + salarioMedio(salMedio));

        } while (true);

        System.out.println("La cantidad de persona es de: " + contadorPersonas);
        System.out.println("El acumulado total es de: " + acumulador);
        System.out.println("La media de salarios es de: " + acumulador / contadorPersonas);



    }



    public static String salarioMedio(double salario) {
        if (salario < 25000)
            return "Salario Bajo";
        else if (salario >= 25000 && salario <= 45000)
            return "Salario medio";
        else if (salario >= 45000)
            return "Salario Alto";
        else
            return "Salario muy alto";
    }

    public static String sexoPersona(char sexo) {
        String literal = null;
        if (sexo == 'H' || sexo == 'h')
            literal = "Hombre";
        else if (sexo == 'M' || sexo == 'm')
            literal = "Mujer";
        else
            literal = "Caracter incorrecto";

        return literal;

    }




}



import java.util.Scanner;

public class Menu {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;



        do {

            System.out.println("******MENU******");
            System.out.println("----------------");
            System.out.println("1. Conversor decimal - binario");
            System.out.println("2. Calculadora");
            System.out.println("3. Analizador de frase");
            System.out.println("4. Salir");

            System.out.println("Introduzca una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    conversor();
                    break;
                case 2:
                    calculadora();
                    break;

                case 3:
                    analizador();
                    break;

                case 4:
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");

            }
        } while (opcion != 4);

    }
    static void conversor() {
        int decimal, modulo, aux;
        String binario = "";
        System.out.println("Introduzca un numero decimal");
        decimal = entrada.nextInt();
        aux = decimal;
        while (decimal > 0) {
            modulo = (decimal % 2);
            binario = modulo + binario;
            decimal = decimal / 2;

        }
        System.out.println("El numero " + aux + " en binario es " + binario);
    }

    static void calculadora() {
        float num1 = 0, num2 = 0;
        float resultado = 0;
        String operador = "+ - / *";
        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextFloat();
        System.out.println("Introduza otro numero: ");
        num2 = entrada.nextFloat();
        System.out.println("Que operador quieres usar +,-,*,/:  ");
        operador = entrada.next();
        if (operador.equals("+")) {
            resultado = num1 + num2;
        }
        if (operador.equals("-")) {
            resultado = num1 - num2;
        }
        if (operador.equals("*")) {
            resultado = num1 * num2;
        }
        if (operador.equals("/")) {
            resultado = num1 / num2;
        }


        System.out.println(num1 + " " + operador + " " + num2 + " " + "=" + " " + resultado);
    }

    static void analizador() {
        String palabra;
        String vocales = "aeiou";
        String consonantes = "bcdfghjñlmnpqrstvxwyz";


        String vocalesEncontradas = "";
        String consonantesEncontradas = "";




        System.out.println("Introduce una palabra: ");
        palabra = entrada.next();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.toLowerCase().charAt(i);

            if (vocales.indexOf(letra) > -1) {
                vocalesEncontradas += palabra.charAt(i);
            } else if (consonantes.indexOf(letra) > -1) {
                consonantesEncontradas += palabra.charAt(i);
            }

        }

        System.out.println("PALABRA " + "    " + "CONSONANTES" + "    " + "VOCALES" + "    " + "LONGITUD");
        System.out.println(palabra + "            " + consonantesEncontradas + "             " + vocalesEncontradas + "           " + palabra.length());





    }

}
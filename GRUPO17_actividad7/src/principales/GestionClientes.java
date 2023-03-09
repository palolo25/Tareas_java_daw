package principales;

import java.util.Scanner;

public class GestionClientes {

	public static void main(String[] args) {
		
	    while (true) {
            // Mostrar el menu
            mostrarMenu();

            // Leer la opcion del usuario
            int opcion = leerOpcion();

            // Ejecutar la opcion elegida por el usuario
            switch(opcion) {
                case 1:
                    altaCliente();
                    break;
                case 2:
                    buscarCliente();
                    break;
                case 3:
                    mostrarClientes();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                    // Salir del programa
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    static void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Alta del Cliente");
        System.out.println("2. Buscar un Cliente");
        System.out.println("3. Mostrar Todos");
        System.out.println("4. Eliminar un cliente");
        System.out.println("5. Salir");
    }

    static int leerOpcion() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una opcion: ");
        return scanner.nextInt();
    }

    static void altaCliente() {
        // Implementar la logica para dar de alta a un cliente
    }

    static void buscarCliente() {
        // Implementar la logica para buscar un cliente
    }

    static void mostrarClientes() {
        // Implementar la logica para mostrar todos los clientes
    }

    static void eliminarCliente() {
        // Implementar la logica para eliminar un cliente
    }

	}



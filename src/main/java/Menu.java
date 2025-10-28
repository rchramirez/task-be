import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public void show() {
        int option;
        do {
            printMenu();
            option = readOption();
            handleOption(option);
        } while (option != 7);
    }

    private void printMenu() {
        System.out.println("=================================== SISTEMA DE GESTIÓN - TECHLAB ==================================");
        System.out.println("1) Agregar producto");
        System.out.println("2) Listar productos");
        System.out.println("3) Buscar/Actualizar producto");
        System.out.println("4) Eliminar producto");
        System.out.println("5) Crear un pedido");
        System.out.println("6) Listar pedidos");
        System.out.println("7) Salir");
        System.out.print("Elija una opción: ");
    }

    private int readOption() {
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void handleOption(int option) {
        switch (option) {
            case 1 -> System.out.println("Agregar producto seleccionado.");
            case 2 -> System.out.println("Listar productos seleccionado.");
            case 3 -> System.out.println("Buscar/Actualizar producto seleccionado.");
            case 4 -> System.out.println("Eliminar producto seleccionado.");
            case 5 -> System.out.println("Crear un pedido seleccionado.");
            case 6 -> System.out.println("Listar pedidos seleccionado.");
            case 7 -> System.out.println("Saliendo del sistema...");
            default -> System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
}
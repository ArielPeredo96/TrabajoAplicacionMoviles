import java.util.Scanner;
import java.util.InputMismatchException;

public class DistribuidoraApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String marca, modelo, tipoCombustible;
        int cilindrada = -1, capacidadPasajeros;

        // Solicitar información del vehículo
        System.out.print("Ingrese la marca: ");
        marca = input.nextLine();

        System.out.print("Ingrese el modelo: ");
        modelo = input.nextLine();

        // Validar la cilindrada
        do {
            System.out.print("Introduce la cilindrada del motor (número positivo): ");
            try {
                cilindrada = input.nextInt();
                if (cilindrada < 0) {
                    System.out.println("Error: la cilindrada no puede ser un número negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número válido.");
                input.next();  // Limpiar el input inválido
            }
        } while (cilindrada < 0);

        // Consumir la nueva línea
        input.nextLine();

        System.out.print("Ingrese el tipo de combustible: ");
        tipoCombustible = input.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros: ");
        capacidadPasajeros = input.nextInt();

        // Mostrar la información ingresada
        System.out.println("\nInformación del vehículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);

        input.close();
    }
}


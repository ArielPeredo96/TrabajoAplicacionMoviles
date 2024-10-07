// Importamos la clase Scanner para capturar la entrada del usuario
import java.util.Scanner;

public class DistribuidoraApp {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner input = new Scanner(System.in);

        // Declaración de las variables
        String marca, modelo, tipoCombustible;
        int cilindrada, capacidadPasajeros;

        // Capturamos los datos de entrada del usuario
        System.out.print("Ingrese la marca: ");
        marca = input.nextLine();

        System.out.print("Ingrese el modelo: ");
        modelo = input.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        cilindrada = input.nextInt();

        System.out.print("Ingrese el tipo de combustible: ");
        input.nextLine();  // Consumimos la nueva línea
        tipoCombustible = input.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros: ");
        capacidadPasajeros = input.nextInt();

        // Mostrar los datos ingresados
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // Cerramos el scanner para evitar fugas de memoria
        input.close();
    }
}

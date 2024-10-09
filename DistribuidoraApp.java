import java.util.Scanner; // Importa la clase Scanner para permitir la entrada de datos del usuario.
import java.util.InputMismatchException; // Importa la clase InputMismatchException para manejar errores de tipo de entrada.

public class DistribuidoraApp { // Define la clase DistribuidoraApp.
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar la aplicación.
        Scanner input = new Scanner(System.in); // Crea un objeto Scanner llamado 'input' para leer datos desde la entrada estándar (teclado).
        
        String marca, modelo, tipoCombustible; // Declara variables de tipo String para almacenar la marca, modelo y tipo de combustible del vehículo.
        int cilindrada = -1, capacidadPasajeros; // Declara la variable 'cilindrada' inicializada en -1 para indicar que aún no se ha ingresado un valor válido, y 'capacidadPasajeros' para almacenar la capacidad del vehículo.

        // Solicitar información del vehículo
        System.out.print("Ingrese la marca: "); // Solicita al usuario que ingrese la marca del vehículo.
        marca = input.nextLine(); // Lee la entrada del usuario y la asigna a la variable 'marca'.

        System.out.print("Ingrese el modelo: "); // Solicita al usuario que ingrese el modelo del vehículo.
        modelo = input.nextLine(); // Lee la entrada del usuario y la asigna a la variable 'modelo'.

        // Validar la cilindrada
        do { // Inicia un bucle que se repetirá mientras la cilindrada sea un número negativo.
            System.out.print("Introduce la cilindrada del motor (número positivo): "); // Solicita al usuario que ingrese la cilindrada del motor.
            try { // Inicia un bloque try para manejar posibles excepciones.
                cilindrada = input.nextInt(); // Lee la entrada del usuario como un entero y la asigna a la variable 'cilindrada'.
                if (cilindrada < 0) { // Verifica si la cilindrada ingresada es negativa.
                    System.out.println("Error: la cilindrada no puede ser un número negativo."); // Muestra un mensaje de error si la cilindrada es negativa.
                }
            } catch (InputMismatchException e) { // Captura la excepción si el usuario no ingresa un número válido.
                System.out.println("Error: debe ingresar un número válido."); // Muestra un mensaje de error si la entrada no es un número.
                input.next();  // Limpia la entrada inválida para evitar un bucle infinito.
            }
        } while (cilindrada < 0); // Continúa el bucle si la cilindrada sigue siendo negativa.

        // Consumir la nueva línea
        input.nextLine(); // Consume la nueva línea que queda en el buffer después de leer un entero.

        System.out.print("Ingrese el tipo de combustible: "); // Solicita al usuario que ingrese el tipo de combustible del vehículo.
        tipoCombustible = input.nextLine(); // Lee la entrada del usuario y la asigna a la variable 'tipoCombustible'.

        System.out.print("Ingrese la capacidad en pasajeros: "); // Solicita al usuario que ingrese la capacidad de pasajeros del vehículo.
        capacidadPasajeros = input.nextInt(); // Lee la entrada del usuario como un entero y la asigna a la variable 'capacidadPasajeros'.

        // Mostrar la información ingresada
        System.out.println("\nInformación del vehículo:"); // Imprime un encabezado para mostrar la información del vehículo.
        System.out.println("Marca: " + marca); // Muestra la marca ingresada.
        System.out.println("Modelo: " + modelo); // Muestra el modelo ingresado.
        System.out.println("Cilindrada: " + cilindrada + " cc"); // Muestra la cilindrada ingresada en centímetros cúbicos.
        System.out.println("Tipo de combustible: " + tipoCombustible); // Muestra el tipo de combustible ingresado.
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros); // Muestra la capacidad de pasajeros ingresada.

        input.close(); // Cierra el objeto Scanner para liberar los recursos asociados.
    }
}

import java.util.Scanner;
import java.text.DecimalFormat;

// Clase principal que implementa una calculadora simple
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        DecimalFormat df = new DecimalFormat("#.###");

        // Bucle principal del programa que permite al usuario realizar varias operaciones
        do {
            System.out.println("Calculadora - Opciones:");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.print("Que opcion deseas realizar?: ");
            opcion = scanner.nextInt();
            // Condicional que verifica si la entrada es valida
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo numero: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + df.format(Operaciones.sumar(num1, num2)));
                        break;
                    case 2:
                        System.out.println("Resultado: " + df.format(Operaciones.restar(num1, num2)));
                        break;
                    case 3:
                        System.out.println("Resultado: " + df.format(Operaciones.multiplicar(num1, num2)));
                        break;
                    case 4:
                        System.out.println("Resultado: " + df.format(Operaciones.dividir(num1, num2)));
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opcion no valida. Por favor, elige una opcion valida.");
            }

        } while (opcion != 0);

        System.out.println("Hasta la vista");

    }
}
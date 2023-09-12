package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio #2
 * Clase Principal
 * @author Ivan Rodriguez Saiz
 */
public class AppOperaciones {

    /**
     * Métodos estáticos
     */
    static int suma(int a, int b) {
        return a + b;
    }
    static int resta(int a, int b) {
        return a - b;
    }
    static int producto(int a, int b) {
        return a * b;
    }
    static int division(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val1 = 0;
        int val2 = 0;
        int isOK = 0;
        int opcion = 0;

        // Captura por teclado de valores enteros
        do {
            if (isOK == 0) {
                try {
                    System.out.print("Introduzca un valor entero: ");
                    val1 = sc.nextInt();
                    isOK++;
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: Debe ser un valor numérico entero.");
                    System.out.println();
                    sc.next();
                }
            } else {
                try {
                    System.out.print("Introduzca otro valor entero: ");
                    val2 = sc.nextInt();
                    isOK++;
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: Debe ser un valor numérico entero.");
                    System.out.println();
                    sc.next();
                }
            }
        } while (isOK != 2);

        // Menu de Operaciones
        do {
            try {
                System.out.println("Que desea hacer con esos valores?");
                System.out.println("1) Sumar 2) Restar 3) Multiplicar 4) Dividir");
                System.out.print("Escoja una Opción: ");
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe ser un valor numérico comprendido entre 1 y 4.");
                System.out.println();
                sc.next();
            }
        } while (opcion < 1 || opcion > 4);

        System.out.println(val1);
        System.out.println(val2);
    }
}

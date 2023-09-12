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
        int r = 0;
        try {
            r = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ERROR: Imposible dividir por 0.");
        }
        return r;
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

        // Menu
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

        switch (opcion) {
            case 1 -> System.out.printf("La Suma de %d + %d es igual a %d.\n", val1, val2, suma(val1, val2));
            case 2 -> System.out.printf("La Resta de %d - %d es igual a %d.\n", val1, val2, resta(val1, val2));
            case 3 -> System.out.printf("El Producto de %d * %d es igual a %d.\n", val1, val2, producto(val1, val2));
            case 4 -> System.out.printf("La División de %d / %d es igual a %d.\n", val1, val2, division(val1, val2));
        }
    }
}

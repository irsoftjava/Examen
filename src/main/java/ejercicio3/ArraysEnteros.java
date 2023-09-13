package ejercicio3;

import java.util.Arrays;

/**
 * Ejercicio #3
 * @author Ivan Rodriguez Saiz
 */
public class ArraysEnteros {

    static int max(int[] valores) {
        int m = valores[0];
        for (int valore : valores) {
            if (valore > m) m = valore;
        }
        return m;
    }

    static int pos(int[] valores, int v) {
        int p = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == v) {
                p = i;
                break;
            }
        }
        return p;
    }
    public static void main(String[] args) {

        int[] enteros = new int[] {1, 524, 423, 825, 1524, 324, 899, 975, 775, 657};

        int maximo = max(enteros);
        int p = pos(enteros, maximo);

        System.out.println();
        System.out.println(Arrays.toString(enteros));
        System.out.println("El máximo valor es: " + maximo);
        System.out.printf("El valor %d esta en la posición %d\n", maximo, p);

    }
}

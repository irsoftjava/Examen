package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio #4
 * Clase Principal
 */

public class AppLibros {

    static double mayorPrecio(List<Libro> ls) {
        double mp = ls.get(0).getPrecio();
        for (Libro l : ls) {
            if (l.getPrecio() > mp) {
                mp = l.getPrecio();
            }
        }
        return mp;
    }

    public static void main(String[] args) {

        //
        List<Libro> libros = new ArrayList<>();

        // Cargado de Libros
        libros.add(new Libro("84-121-2310-1", "El transito terreno", "Juan Luis Placencia", "Novela", 1995, 23.45));
        libros.add(new Libro("84-7489-146-9", "Sistemas Operativos", "Eric Bazilian", "Informática", 2001, 45.4));
        libros.add(new Libro("84-305-0473-7", "Poemas Intrínsecos","Antonia Llorens","Poesía", 1999, 17.5));
        libros.add(new Libro("84-473-0120-6","Avances en Arquitectura","Helmut Richter","Informática", 2005,39.4));

        // Listar Libros
        for (Libro l : libros) {
            System.out.println(l);
        }

        // Mayor
        double mayor = mayorPrecio(libros);
        System.out.println(mayor);

        // Categoría
        int cc = (int)libros.stream()
                .filter(p -> p.getCategoria().equals("Informática"))
                .count();
        System.out.println(cc);

        // Ordenar
        libros.sort(new Comparator<Libro>() {
            @Override
            public int compare(Libro o1, Libro o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        });

        // Listar Libros
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
}

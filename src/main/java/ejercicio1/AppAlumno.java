package ejercicio1;

import java.util.ArrayList;

/**
 * Ejercicio #1
 * Clase Principal
 * @author Ivan Rodriguez Saiz
 */
public class AppAlumno {

    public static void main(String[] args) {

        // Definición del ArrayList
        ArrayList<Alumno> arrayAlumno = new ArrayList<>();

        // Creación de los Objetos tipo Alumno
        Alumno a01 = new Alumno();
        a01.setNombre("Eduardo");
        a01.setApellidos("Perez");
        a01.setEdad(25);

        Alumno a02 = new Alumno("Ana", "Rodriguez", 18);
        Alumno a03 = new Alumno("Miguel", "Santana", 35);
        Alumno a04 = new Alumno("Yuni", "Brito", 30);
        Alumno a05 = new Alumno("Alejandro", "Garcia", 46);
        Alumno a06 = new Alumno("Juan", "Acosta", 17);
        Alumno a07 = new Alumno("Ernesto", "Navarro", 40);
        Alumno a08 = new Alumno("Maria", "Hernandez", 33);
        Alumno a09 = new Alumno("Emilio", "Fernandez", 17);
        Alumno a10 = new Alumno("Antonio", "Cruz", 25);

        // Se agregan los objetos al array
        arrayAlumno.add(a01);
        arrayAlumno.add(a02);
        arrayAlumno.add(a03);
        arrayAlumno.add(a04);
        arrayAlumno.add(a05);
        arrayAlumno.add(a06);
        arrayAlumno.add(a07);
        arrayAlumno.add(a08);
        arrayAlumno.add(a09);
        arrayAlumno.add(a10);

        // Se imprimen los objetos
        for (Alumno a : arrayAlumno) {
            System.out.println(a);
        }
    }
}

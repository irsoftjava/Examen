package ejercicio1;

/**
 * Clase Alumno
 * @author Ivan Rodriguez Saiz
 */
public class Alumno {

    /**
     * Atributos
     */
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * Constructor vacio
     */
    public Alumno() {
    }

    /**
     * Constructor parametrizado
     * @param nombre String
     * @param apellidos String
     * @param edad int
     */
    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Métodos
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno: " + this.nombre + " " + apellidos + " tiene " + edad + " años.";
    }
}

package ejercicio5;

/**
 * Clase Persona
 */
public class Persona {

    /**
     * Atributos
     */
    protected String nombre;
    protected String direccion;
    protected int edad;

    /**
     * Constructor vacío
     */
    public Persona() {
    }

    /**
     * Constructor parametrizado
     * @param nombre
     * @param direccion
     * @param edad
     */
    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean mayorDeEdad() {
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }
}

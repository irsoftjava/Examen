package ejercicio5;

/**
 * Clase Estudiante
 */
public class Estudiante extends Persona {

    /**
     * Atributos
     */
    private String codigo;

    /**
     * Constructor vacío
     */
    public Estudiante() {
    }

    /**
     * Constructor Parametrizado
     * @param nombre
     * @param direccion
     * @param edad
     * @param codigo
     */
    public Estudiante(String nombre, String direccion, int edad, String codigo) {
        super(nombre, direccion, edad);
        this.codigo = codigo;
    }
}

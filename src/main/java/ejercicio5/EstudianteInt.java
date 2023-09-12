package ejercicio5;

/**
 * Clase EstudianteInt
 */
public class EstudianteInt extends Estudiante {

    /**
     * Atributos
     */
    private Boolean esErasmus;
    private String nacionalidad;

    /**
     * Constructor vacío
     */
    public EstudianteInt() {
    }

    /**
     * Constructor Parametrizado
     * @param nombre
     * @param direccion
     * @param edad
     * @param codigo
     * @param esErasmus
     * @param nacionalidad
     */
    public EstudianteInt(String nombre, String direccion, int edad, String codigo, Boolean esErasmus, String nacionalidad) {
        super(nombre, direccion, edad, codigo);
        this.esErasmus = esErasmus;
        this.nacionalidad = nacionalidad;
    }
}

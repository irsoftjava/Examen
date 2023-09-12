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

    /**
     * Métodos
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }
}

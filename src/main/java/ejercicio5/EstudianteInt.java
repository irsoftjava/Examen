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

    /**
     * Métodos
     * @return
     */
    public Boolean getEsErasmus() {
        return esErasmus;
    }

    public void setEsErasmus(Boolean esErasmus) {
        this.esErasmus = esErasmus;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean esEuropeo() {
        return true;
    }

    public boolean descuentosParaJovenes() {
        return true;
    }

    @Override
    public String toString() {
        return "EstudianteInt{" +
                "esErasmus=" + esErasmus +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }
}

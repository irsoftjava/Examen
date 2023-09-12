package ejercicio5;

/**
 * Clase EstudianteInt
 */
public class EstudianteInt extends Estudiante {

    /**
     * Atributos
     */
    private boolean esErasmus;
    private String nacionalidad;

    /**
     * Constructor vacío
     */
    public EstudianteInt() {
    }

    /**
     * Constructor Parametrizado
     * @param nombre String
     * @param direccion String
     * @param edad int
     * @param codigo String
     * @param esErasmus boolean
     * @param nacionalidad String
     */
    public EstudianteInt(String nombre, String direccion, int edad, String codigo, Boolean esErasmus, String nacionalidad) {
        super(nombre, direccion, edad, codigo);
        this.esErasmus = esErasmus;
        this.nacionalidad = nacionalidad;
    }

    /**
     * Métodos
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
        return this.nacionalidad.equals(Nacionalidad.INGLES.toString()) ||
                this.nacionalidad.equals(Nacionalidad.FRANCES.toString()) ||
                this.nacionalidad.equals(Nacionalidad.PORTUGUES.toString());
    }

    public boolean descuentosParaJovenes() {
        return this.esErasmus && this.edad < 25;
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

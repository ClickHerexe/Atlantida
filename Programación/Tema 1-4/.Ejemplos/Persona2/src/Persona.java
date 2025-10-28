public class Persona {

    private String nombre;
    private int edad;
    private String numeroDocumento;

    public Persona(String nombre, int edad, String numeroDocumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int nuevoEdad) {
        this.edad = nuevoEdad;
    }

    public String getnumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setnumeroDocumento(String nuevonumeroDocumento) {
        this.numeroDocumento = nuevonumeroDocumento;
    }
}

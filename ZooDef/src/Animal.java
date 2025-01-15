public abstract class Animal {
    // ******* ATRIBUTOS *******
    private String nombre;
    private int edad;
    private float peso;
    private float kilosComidaSemanal;
    private boolean esHembra;
    private String cuidador;

    // ******* CONSTRUCTORES ********
    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
        this.kilosComidaSemanal = 0;
        this.esHembra = false;
        this.cuidador = "";
    }

    public Animal(String nombre, int edad, float peso, float kilosComidaSemanal, boolean esHembra, String cuidador) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.kilosComidaSemanal = kilosComidaSemanal;
        this.esHembra = esHembra;
        this.cuidador = cuidador;
    }

    // ******* SETTERS *******
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setKilosComidaSemanal(float kilosComidaSemanal) {
        this.kilosComidaSemanal = kilosComidaSemanal;
    }

    public void setEsHembra(boolean esHembra) {
        this.esHembra = esHembra;
    }

    public void setCuidador(String cuidador) {
        this.cuidador = cuidador;
    }

    // ******* GETTERS *******
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public float getKilosComidaSemanal() {
        return kilosComidaSemanal;
    }

    public boolean getEsHembra() {
        return esHembra;
    }

    public String getCuidador() {
        return cuidador;
    }

    // ******* MÉTODOS *******
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Peso: ").append(peso).append("\n");
        sb.append("Kilos: ").append(kilosComidaSemanal).append("\n");
        sb.append("Sexo: ");
        if (esHembra) {
            sb.append("Hembra").append("\n");
        }
        else {
            sb.append("Macho").append("\n");
        }
        sb.append("Cuidador: ").append(cuidador).append("\n");

        return sb.toString();
    }
}

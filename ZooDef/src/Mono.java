public class Mono extends Animal {
    // ******* ATRIBUTOS *******
    private String tipo;

    // ******* CONSTRUCTORES *******
    public Mono() {
        super();
        this.tipo = "";
    }

    public Mono(String nombre, int edad, float peso, float kilosComidaSemanal, boolean esHembra, String cuidador, String tipo) {
        super(nombre, edad, peso, kilosComidaSemanal, esHembra, cuidador);
        this.tipo = tipo;
    }

    // ******* SETTERS *******
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // ******* GETTERS *******
    public String getTipo() {
        return tipo;
    }

    // ******* MÉTODOS *******
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());

        sb.append("Tipo: ").append(this.tipo).append("\n");

        return sb.toString();
    }
}

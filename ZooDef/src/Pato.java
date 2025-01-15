public class Pato extends Animal {
    // ******* ATRIBUTOS *******
    private String color;
    private boolean vuela;

    // ******* CONSTRUCTORES *******
    public Pato() {
        super();
        this.color = "";
        this.vuela = false;
    }

    public Pato(String nombre, int edad, float peso, float kilosComidaSemanal, boolean esHembra, String cuidador, String color, boolean vuela) {
        super(nombre, edad, peso, kilosComidaSemanal, esHembra, cuidador);
        this.color = color;
        this.vuela = vuela;
    }

    // ******* SETTERS *******
    public void setColor(String color) {
        this.color = color;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    // ******* GETTERS *******
    public String getColor() {
        return color;
    }

    public boolean getVuela() {
        return vuela;
    }

    // ******* MÉTODOS *******
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());

        sb.append("Color: ").append(this.color).append("\n");
        sb.append("Vuela: ").append(this.vuela).append("\n");

        return sb.toString();
    }
}

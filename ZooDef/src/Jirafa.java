public class Jirafa extends Animal {
    // ******* ATRIBUTOS *******
    private float altura;
    private int numeroManchas;

    // ******* CONSTRUCTORES *******
    public Jirafa() {
        super();
        this.altura = 0;
        this.numeroManchas = 0;
    }

    public Jirafa(String nombre, int edad, float peso, float kilosComidaSemanal, boolean esHembra, String cuidador, float altura, int numeroManchas) {
        super(nombre, edad, peso, kilosComidaSemanal, esHembra, cuidador);
        this.altura = altura;
        this.numeroManchas = numeroManchas;
    }

    // ******* SETTERS *******
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setNumeroManchas(int numeroManchas) {
        this.numeroManchas = numeroManchas;
    }

    // ******* GETTERS *******
    public float getAltura() {
        return altura;
    }

    public int getNumeroManchas() {
        return numeroManchas;
    }

    // ******* MÉTODOS *******
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());

        sb.append("Altura: ").append(this.altura).append("\n");
        sb.append("Número de manchas: ").append(this.numeroManchas).append("\n");

        return sb.toString();
    }
}

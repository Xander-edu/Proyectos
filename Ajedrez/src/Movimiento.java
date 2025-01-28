public class Movimiento {
    // ******* ATRIBUTOS *******
    Posicion posInicial;
    Posicion posFinal;

    // ******* CONSTRUCTORES *******
    public Movimiento() {
        this.posInicial = new Posicion(0,0);
        this.posFinal = new Posicion(0,0);
    }

    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    // ******* MÉTODOS *******
    public boolean esVertical() {

    }

    public boolean esHorizontal() {

    }

    public boolean esDiagonal() {

    }

    public int saltoHorizontal() {}

    public int saltoVertical() {}
}

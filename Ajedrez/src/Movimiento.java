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
        return false;
    }

    public boolean esHorizontal() {
        return false;
    }

    public boolean esDiagonal() {
        return false;
    }

    public int saltoHorizontal() {
        return 0;
    }

    public int saltoVertical() {
        return 0;
    }
}

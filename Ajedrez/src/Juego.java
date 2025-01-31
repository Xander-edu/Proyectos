public class Juego {
    private boolean elTurno; // Como el color de pieza: true = BLANCAS , false = NEGRAS

    public boolean getTurno() {
        return elTurno;
    }

    public void setTurno(boolean elTurno) {
        this.elTurno = elTurno;
    }

    public Movimiento jugada(String jugada, Tablero tablero) {
        int columnaInicial = jugada.charAt(0) - 'A';
        int filaInicial = jugada.charAt(1) - '1';

        return null;
    }
}

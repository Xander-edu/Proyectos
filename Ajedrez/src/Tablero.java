public class Tablero {
    // ******* ATRIBUTOS *******
    Pieza[][] tablero = new Pieza[8][8];

    // ******* CONSTRUCTORES *******
    public Tablero() {
        tablero[0][0] = new Torre("b", "Torre");
    }

    // ******* MÉTODOS *******
    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (hayPieza(i,j)) {

                }
            }
        }
    }

    public boolean hayPieza(int fila, int columna) {
        return tablero[fila][columna] != null;
    }

    public boolean hayPieza(Posicion pos) {
        return tablero[pos.getFila()][pos.getColumna()] != null;
    }

    public boolean hayPiezasEntre (Movimiento mov) {

    }

    public void ponPieza (Pieza figura, int fila, int columna) {
        tablero[fila][columna] = figura;
    }

    public void ponPieza (Pieza figura, Posicion pos) {
        tablero[pos.getFila()][pos.getColumna()] = figura;
    }

    public void quitaPieza (int fila, int columna) {
        tablero[fila][columna] = null;
    }

    public void quitaPieza (Posicion pos) {
        tablero[pos.getFila()][pos.getColumna()] = null;
    }

    public Pieza devuelvePieza (int fila, int columna) {
        return tablero[fila][columna];
    }

    public Pieza devuelvePieza (Posicion pos) {
        return tablero[pos.getFila()][pos.getColumna()];
    }
}

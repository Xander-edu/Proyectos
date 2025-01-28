public class Torre extends Pieza     {
    // ******* CONSTRUCTORES *******
    public Torre(String color, String nombre) {
        super(color, nombre);
    }

    // ******* MÉTODOS *******
    public boolean validoMovimiento (Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal();
    }
}

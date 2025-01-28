public abstract class Pieza {
    // ******* ATRIBUTOS *******
    String color;
    String nombre;

    // ******* CONSTRUCTORES *******
    public Pieza(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    // ******* GETTERS *******
    public String getColor() {
        return color;
    }

    // ******* MÉTODOS *******
    public abstract boolean validoMovimiento (Movimiento mov);

    public String toString() {
        return super.toString();
    }
}

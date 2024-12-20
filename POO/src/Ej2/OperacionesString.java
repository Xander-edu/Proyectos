package Ej2;

public class OperacionesString {
    public static String iniciales(String nombre, String apellido1, String apellido2) {
        return nombre.charAt(0) + ", " + apellido1.charAt(0) + ", " + apellido2.charAt(0);
    }

    public static String concatenacion(String str1, String str2) {
        return str1.concat(str2).toUpperCase();
    }

    public static int cuentaPalabra(String frase) {
        String palabras[] = frase.trim().split(" ");
        return palabras.length;
    }

    public static int ocurrenciasString(String ocurrencia, String frase) {
        int cont = 0;
        int indice = frase.indexOf(ocurrencia);

        while (indice != -1) {
            cont++;
            indice = frase.indexOf(ocurrencia, indice + 1);
        }

        return cont;
    }
}
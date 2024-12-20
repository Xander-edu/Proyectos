import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        boolean noValido = false;

        do {
            if (!noValido) {
                System.out.println();
                System.out.println("Elige una opción:");
                System.out.println("1. Iniciales nombre y apellidos");
                System.out.println("2. Concatenación strings en mayúsculas");
                System.out.println("3. Contar palabras");
                System.out.println("4. Contar ocurrencias de un string");
                System.out.println("5. Salir");
            }
            noValido = false;

            opcion = lector.nextInt();

            // Limpia el buffer en caso de que haya restos
            if (lector.hasNextLine()) {
                lector.nextLine();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = lector.next();
                    System.out.println("Ingrese el primer apellido: ");
                    String apellido1 = lector.next();
                    System.out.println("Ingrese el segundo apellido: ");
                    String apellido2 = lector.next();
                    System.out.println("Las iniciales son: " + OperacionesString.iniciales(nombre, apellido1, apellido2));
                    break;

                case 2:
                    System.out.println("Ingrese una palabra o frase: ");
                    String str1 = lector.nextLine();
                    System.out.println("Ingrese otra palabra o frase: ");
                    String str2 = lector.nextLine();
                    System.out.println(OperacionesString.concatenacion(str1, str2));
                    break;

                case 3:
                    System.out.println("Ingrese una frase: ");
                    String frase = lector.nextLine();
                    System.out.println("Número de palabras: " + OperacionesString.cuentaPalabra(frase));
                    break;

                case 4:
                    System.out.println("Ingrese una frase: ");
                    String fraseOcu = lector.nextLine();
                    System.out.println("Ingrese la palabra o serie de caracteres que quiera buscar: ");
                    String ocurrencia = lector.nextLine();
                    System.out.println("\"" + ocurrencia + "\" aparece " + OperacionesString.ocurrenciasString(ocurrencia, fraseOcu) + " veces.");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Elija una opción del menú.");
                    noValido = true;
            }
        } while (opcion != 5);
    }
}

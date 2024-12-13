import java.util.Scanner;

public class Main {
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static void selector(int opcion, Scanner lector) {
        switch (opcion) {
            case 1:
                System.out.println("Introduce dos números para sumar:");
                int a = lector.nextInt();
                int b = lector.nextInt();
                System.out.println("Resultado: " + sumar(a, b));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static int menu(Scanner sc) {
        System.out.println("Elige una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = menu(lector);
        selector(opcion, lector);
        lector.close();
    }
}

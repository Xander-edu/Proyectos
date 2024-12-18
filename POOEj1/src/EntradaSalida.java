import java.io.InputStreamReader;
import java.util.Scanner;

public class EntradaSalida {
    public static Mono dameMono(){
        Mono nuevoMono = null;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce: 1. mono estándar 2. mono personalizado");
        int opcion = lector.nextInt();
        lector.nextLine();
        if (opcion==1)
            nuevoMono = new Mono();
        else {
            System.out.println("Introduce nombre, edad, peso, true (hembra) / false (varón), tipo, kilos comida semana y cuidador (separados por comas)");
            String mono = lector.nextLine();
            String[] atributos = mono.split(",");

            String nombre = "";
            int edad = 0;
            float peso = 0;
            boolean hembra = false;
            String tipo = "";
            int comida = 0;
            String cuidador = "";

            if (atributos.length == 7) {
                nombre = atributos[0].trim();
                edad = Integer.parseInt(atributos[1].trim());
                peso = Float.parseFloat(atributos[2].trim());
                hembra = Boolean.parseBoolean(atributos[3].trim());
                tipo = atributos[4].trim();
                comida = Integer.parseInt(atributos[5].trim());
                cuidador = atributos[6].trim();
            } else {
                System.out.println("Error: Introduce todos los atributos.");
            }

            nuevoMono = new Mono(nombre,edad,peso,hembra,tipo,comida,cuidador);
        }
        return nuevoMono;
    }

    public static Jirafa dameJirafa(){
        Jirafa nuevaJirafa = null;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce: 1. Jirafa estándar 2. Jirafa personalizada");
        int opcion = lector.nextInt();
        lector.nextLine();
        if (opcion==1)
            nuevaJirafa = new Jirafa();
        else {
            System.out.println("Introduce nombre, edad, peso, true (hembra) / false (varón), longitud del cuello, kilos comida semana y cuidador (separados por comas)");
            String jirafa = lector.nextLine();
            String[] atributos = jirafa.split(",");

            String nombre = "";
            int edad = 0;
            float peso = 0;
            boolean hembra = false;
            float longitudCuello = 0;
            int comida = 0;
            String cuidador = "";

            if (atributos.length == 7) {
                nombre = atributos[0].trim();
                edad = Integer.parseInt(atributos[1].trim());
                peso = Float.parseFloat(atributos[2].trim());
                hembra = Boolean.parseBoolean(atributos[3].trim());
                longitudCuello = Float.parseFloat(atributos[4].trim());
                comida = Integer.parseInt(atributos[5].trim());
                cuidador = atributos[6].trim();
            } else {
                System.out.println("Error: Introduce todos los atributos.");
            }

            nuevaJirafa = new Jirafa(nombre,edad,peso,hembra,longitudCuello,comida,cuidador);
        }
        return nuevaJirafa;
    }
}

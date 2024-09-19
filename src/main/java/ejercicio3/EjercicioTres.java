package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioTres {
    // Variables estáticas para almacenar las cadenas ingresadas
    static String cadena1;
    static String cadena2;
    static String cadena3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer cadenas de caracteres desde el teclado
        System.out.println("Ingresa la primera cadena: ");
        cadena1 = scanner.nextLine();

        System.out.println("Ingresa la segunda cadena: ");
        cadena2 = scanner.nextLine();

        System.out.println("Ingresa la tercera cadena: ");
        cadena3 = scanner.nextLine();

        // Crear un objeto StringBuilder y agregar las cadenas
        StringBuilder sb = new StringBuilder();
        sb.append(cadena1).append(" ").append(cadena2).append(" ").append(cadena3);

        // Crear un objeto StringBuffer y agregar las cadenas
        StringBuffer sbf = new StringBuffer();
        sbf.append(cadena1).append(" ").append(cadena2).append(" ").append(cadena3);

        // Mostrar el contenido de ambos objetos
        System.out.println("\nContenido del StringBuilder: " + sb.toString());
        System.out.println("Contenido del StringBuffer: " + sbf.toString());

        // Mostrar la cantidad de cadenas ingresadas en el StringBuilder
        System.out.println("\nCantidad de cadenas en StringBuilder: " + sb.toString().split(" ").length);

        // Guardar las cadenas en un ArrayList
        ArrayList<String> listaCadenas = new ArrayList<>();
        listaCadenas.add(cadena1);
        listaCadenas.add(cadena2);
        listaCadenas.add(cadena3);

        // Recorrer la lista en forma inversa y mostrar las cadenas
        System.out.println("\nCadenas en orden inverso:");
        for (int i = listaCadenas.size() - 1; i >= 0; i--) {
            System.out.println(listaCadenas.get(i));
        }
    }
}


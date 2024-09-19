import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class EjercicioUno {
    static int[] vector;
    static List<Integer> lista;

    public static void TamanoDelVector(Scanner sc){
        boolean inputValido = false;
        while (!inputValido)
            try {
                System.out.println("Ingrese el tamaño del vector:");

                String entrada = sc.nextLine();
                int tamano = Integer.parseInt(entrada);

                vector = new int[tamano];
                inputValido = true;

            } catch (NumberFormatException e){
                System.out.println("valor incorrecto");
            }

    }

    public static void DatosDelVector(Scanner sc) {
        int cantidadNarcisistas = 0; // Contador de números narcisistas
        for (int i = 0; i < vector.length; i++) {
            boolean inputValido = false;
            while (!inputValido) {
                try {
                    System.out.println("Ingrese valor para indice " + i);
                    String entrada = sc.nextLine();
                    int valor = Integer.parseInt(entrada);

                    vector[i] = valor;
                    if (esNarcisista(valor)) {
                        cantidadNarcisistas++; // Aumenta el contador si es narcisista
                    }

                    inputValido = true;  // Salir del ciclo si el valor es válido

                } catch (NumberFormatException e) {
                    System.out.println("Valor incorrecto para el índice " + i + ", intente de nuevo.");
                }
            }
        }
        System.out.println("Datos del vector: " + Arrays.toString(vector));
        System.out.println("Cantidad de números narcisistas ingresados: " + cantidadNarcisistas);
    }

    public static boolean esNarcisista(int numero) {
        String numStr = Integer.toString(numero);
        int numCifras = numStr.length();
        int suma = 0;

        for (char c : numStr.toCharArray()) {
            int digito = Character.getNumericValue(c);
            suma += Math.pow(digito, numCifras); // Eleva el dígito a la potencia del número de cifras
        }

        return suma == numero; // Compara la suma con el número original
    }

    public static LinkedList<Integer> VectorALinkedList() {
        LinkedList<Integer> lista = new LinkedList<>();
        for (int valor : vector) {
            lista.add(valor); // Copiar cada valor del vector a la LinkedList
        }
        return lista;
    }

    public static void ParOImpar() {
        Deque <Integer> pila = new LinkedList<>();
        Queue <Integer> cola = new LinkedList<>();

        for (int valor : vector){
            if (valor % 2 == 0){
                cola.offer(valor);
            }else {
                pila.push(valor);
            }
        }

        System.out.println("Los datos de la cola son: " + cola);
        System.out.println("Los datos de la pila son: " + pila);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TamanoDelVector(sc);
        DatosDelVector(sc);

        LinkedList<Integer> lista = VectorALinkedList();
        System.out.println("Datos en la LinkedList: " + lista);
        System.out.println("Cantidad de datos de LinkedList: "+ lista.size());

        ParOImpar();

        sc.close();
    }
}

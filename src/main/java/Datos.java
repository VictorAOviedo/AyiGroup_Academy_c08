import java.util.Scanner;

//EjercicioDos
class Datos {
    // Declaración de variables estáticas y finales
    public static final int NUM1;
    public static final int NUM2;
    public static final int NUM3;
    public static final int NUM4;
    public static final int NUM5;
    public static final int NUM6;

    // Bloque estático para inicializar las variables finales
    static {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor para NUM1:");
        NUM1 = scanner.nextInt();

        System.out.println("Ingrese el valor para NUM2:");
        NUM2 = scanner.nextInt();

        System.out.println("Ingrese el valor para NUM3:");
        NUM3 = scanner.nextInt();

        System.out.println("Ingrese el valor para NUM4:");
        NUM4 = scanner.nextInt();

        System.out.println("Ingrese el valor para NUM5:");
        NUM5 = scanner.nextInt();

        System.out.println("Ingrese el valor para NUM6:");
        NUM6 = scanner.nextInt();

        scanner.close();
    }
}

class Main {
    public static void main(String[] args) {
        // Mostramos los valores asignados
        System.out.println("Valores asignados:");
        System.out.println("NUM1: " + Datos.NUM1);
        System.out.println("NUM2: " + Datos.NUM2);
        System.out.println("NUM3: " + Datos.NUM3);
        System.out.println("NUM4: " + Datos.NUM4);
        System.out.println("NUM5: " + Datos.NUM5);
        System.out.println("NUM6: " + Datos.NUM6);

        // Intentar modificar una variable estática y final (esto dará un error)
        //Datos.NUM1 = 10; // Esto provocará un error de compilación, ya que NUM1 es final. Da error: java: cannot assign a value to static final variable NUM1
    }
}

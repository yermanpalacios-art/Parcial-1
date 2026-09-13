import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Array tradicional de tamaño fijo
        int[] numeros = new int[3];

        System.out.println("Ingrese 3 números para el Array:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // ArrayList
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("\nIngrese otros 3 números para el ArrayList:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            lista.add(teclado.nextInt());
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");

        System.out.println("Array tradicional:");
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\nArrayList:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
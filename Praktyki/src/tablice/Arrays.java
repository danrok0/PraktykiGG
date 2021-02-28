import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Przykład 5
        double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};
        System.out.println("Element [0] = " + power[0]);
        System.out.println("Element [1] = " + power[1]);
        System.out.println("Element [2] = " + power[2]);
        System.out.println("Element [3] = " + power[3]);
        System.out.println("Element [4] = " + power[4]);
        System.out.println("Element [5] = " + power[5]);
        System.out.println("Element [6] = " + power[6]);
        System.out.println("Element [7] = " + power[7]);
        System.out.println("Element [8] = " + power[8]);
        System.out.println();
        System.out.println("Po zamianie liczb najwiewksza z najmniejsza miejscami: ");
        System.out.println();
        System.out.println("Element [0] = " + power[0]);
        System.out.println("Element [1] = " + power[1]);
        System.out.println("Element [2] = " + power[2]);
        System.out.println("Element [3] = " + power[3]);
        System.out.println("Element [4] = " + power[4]);
        System.out.println("Element [5] = " + power[8]);
        System.out.println("Element [6] = " + power[6]);
        System.out.println("Element [7] = " + power[7]);
        System.out.println("Element [8] = " + power[5]);

        //Przykład 6
        System.out.println();
        System.out.println("Element [0] = " + power[0]);
        System.out.println("Element [1] = " + power[1]);
        System.out.println("Element [2] = " + power[2]);
        System.out.println("Element [3] = " + power[3]);
        System.out.println("Element [4] = " + power[4]);
        System.out.println("Element [5] = " + power[8]);
        System.out.println("Element [6] = " + power[6]);
        System.out.println("Element [7] = " + power[7]);
        System.out.println("Element [8] = " + power[5]);
        System.out.println();
        System.out.println("PO ODWROCENIU: ");
        System.out.println();
        System.out.println("Element [0] = " + power[5]);
        System.out.println("Element [1] = " + power[7]);
        System.out.println("Element [2] = " + power[6]);
        System.out.println("Element [3] = " + power[8]);
        System.out.println("Element [4] = " + power[4]);
        System.out.println("Element [5] = " + power[3]);
        System.out.println("Element [6] = " + power[2]);
        System.out.println("Element [7] = " + power[1]);
        System.out.println("Element [8] = " + power[0]);

        //Przykład 7
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            if (power[i] < power[i + 1]) {
                System.out.println("Liczba " + power[i + 1] + " jest wieksza od liczby " + power[i]);
            } else {
                System.out.println("Liczba " + power[i] + " jest większa od liczby  " + power[i + 1]);
            }
        }
        // Przykład 8
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String[] person = new String[4];// 0 - 3

        System.out.println("Podaj Imię:");
        person[0] = scanner.next();
        System.out.println("Podaj Rasa:");
        person[1] = scanner.next();
        System.out.println("Podaj Klasa:");
        person[2] = scanner.next();
        System.out.println("Podaj Broń:");
        person[3] = scanner.next();
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
        System.out.println(person[3]);

    }
}

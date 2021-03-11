import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class wyjątki {

    public static void main(String[] args) {
        //Zadanie 1
        int[] array = new int[10];
        Random random = new Random();
        int intRandom;
        try {
            for (int i = 0; i < 11; i++) {
                intRandom = random.nextInt(99);
                array[i] = intRandom;
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Tablica jest już pełna nie można wpisać więcej danych");
        }

        //Zadanie 2
        System.out.println();

        try { int[] tablica = new int[4];
            Scanner scanner = new Scanner(System.in);
            try {
                for (int i = 0; i < 5; i++) {
                    tablica[i] = scanner.nextInt();

                    System.out.println("Dla i=" + i + " Przypisałeś wartość " + tablica[i]);
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Niepoprawne dane!");

            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {System.out.println("Tablica jest już pełna nie można wpisać więcej danych!");
            }

        }finally {
            System.out.println("Koniec !");
        }
    }
}








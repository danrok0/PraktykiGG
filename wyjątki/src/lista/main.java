package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class main {
        public static void main(String[] args)
        {
            //Zadanie 1 i 5

            Scanner scanner = new Scanner(System.in);
            List<String> array = new ArrayList<>();
            for(int i=0;i<10;i++) {
                String x = scanner.nextLine();
                boolean z=false;
                for (String s : array) {
                    if (s.equals(x)) {
                        z = true;
                        break;
                    }
                }

                if (!z) {
                    array.add(x);
                } else {
                    System.out.println("Liczba nie może się powtarzać!");
                }
                System.out.println("Dla liczby i=" + i + " Przypisałeś wartość " + array.get(i));
            }

            //Zadanie 2 i 4

            for(int i = 0; i < array.size(); i++){
                System.out.println("Liczba["+i+"] = "+array.get(i));
            }
            try {
                for(int j=0;j<5;j++){
                    System.out.println("Podaj indeks elementu:");
                    array.remove(scanner.nextInt());
                }
            }catch (java.util.InputMismatchException InputMismatchException){
                System.out.println("Niepoprawny typ danych!");
            }catch (IndexOutOfBoundsException indexOutOfBoundsException){
                System.out.println("Przekroczono wartość elementu!");
            }

            //Zadanie 3

            for (int h = 0; h < 2; h++) {
                System.out.println("Podaj indeks elementu który chcesz podmienić:");
                int x1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Co mam podmienić? " + array.get(x1));
                String y1 = scanner.nextLine();
                array.set(x1, y1);
            }
            for (int i = 0; i < array.size(); i++) {
                System.out.println("Liczba[" + i + "] = " + array.get(i));
            }
        }

}

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {

        //Zadanie 1
        Trojkat trojkat = new Trojkat(3, 2, 30);
        trojkat.obliczPole();
        trojkat.obwodT();

        System.out.println("\t");

        // Zadanie 2
        Prostokat prostokat = new Prostokat(3, 4);
        System.out.println(prostokat.getPole());
        System.out.println(prostokat.getPrzekatne());
        prostokat.setBokA(7);
        prostokat.setBokB(6);
        System.out.println(prostokat.getPole());
        System.out.println(prostokat.getPrzekatne());

        System.out.println("\t");

        //Zadanie 3
        Prostokat Prostokat = new Prostokat(2, 2);
        Trojkat Trojkat = new Trojkat(3, 2, 30);
        if (trojkat.getBokA() == prostokat.getBokA()) System.out.println("boki są równe");
        else if (trojkat.getBokA() > prostokat.getBokA()) System.out.println("bok trójkąta jest dłuższy");
        else System.out.println("bok prostokąta jest dłuższy");
        System.out.println("bok prostokąta " + prostokat.getBokA());
        System.out.println("bok trójkąta " + trojkat.getBokA());

        System.out.println("\t");

        //Zadanie 5
        var okrag = new okrag(5);
        okrag.setSrednica();
        okrag.setPole();
        okrag.obwodkola();
        System.out.println("\t");

        //Zadanie 4
        ProstyKalkulator prostykalkulator = new ProstyKalkulator(6, 2);
        Scanner sc = new Scanner(System.in);
        boolean dziala = true;
        while (dziala) {
            System.out.println("dodawanie[1]");
            System.out.println("odejmowanie[2]");
            System.out.println("mnożenie[3]");
            System.out.println("dzielenie[4]");
            System.out.println("wyłącz[5]");

            String userInput = sc.next();
            System.out.println("podaj pierwszą liczbę™ ");
            double licz1 = sc.nextDouble();
            System.out.println("podaj drugą liczbę™ ");
            double licz2 = sc.nextDouble();

            prostykalkulator.setA(licz1);
            prostykalkulator.setB(licz2);

            switch (userInput) {
                case "1": {
                    prostykalkulator.dodawanie();
                    break;
                }
                case "2": {
                    prostykalkulator.odejmowanie();
                    break;
                }
                case "3": {
                    prostykalkulator.mnozenie();
                    break;
                }
                case "4": {
                    prostykalkulator.dzielenie();
                    break;
                }
                case "5": {
                    dziala = false;
                    break;
                }
                default: {
                    System.out.println("Wybrałeś złą liczbę");
                }
            }
        }



    }
}
public class main
{
    //Zadanie 1
    public static void main(String[] args)
    {
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println(kwadrat.obliczPole());

        Prostokat prostokat = new Prostokat(4,2);
        System.out.println(prostokat.poleProstokata());

        //Zadanie 2
        System.out.println();
        Pies pies = new Pies(7,4,"Misiek","czarna",15 );
        pies.dajGłos();

        //Zadanie 3
        System.out.println();
        Spawacz spawacz = new Spawacz("niebezpieczna", 4000, "pełny");
        spawacz.wykonujePrace();

        //Zadanie 4
        //a. Odp:Metoda 2 przysłania metode 3
        //b. Odp:Metoda 3
    }
}

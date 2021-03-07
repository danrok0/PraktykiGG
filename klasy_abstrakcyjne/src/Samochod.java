public class Samochod implements Pojazd
{
    public boolean ruszaj;

    @Override
    public void ruszaj()
    {
        System.out.println("Rusza");
    }

    public void skrecwLewo()
    {
        System.out.println("Skręcam w lewo");
    }
}
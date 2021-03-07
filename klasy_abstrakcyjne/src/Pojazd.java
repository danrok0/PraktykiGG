public interface Pojazd
{
    default void skrecWLewo()
    {
        System.out.println("Skręcam w lewo");
    }

    default void ruszaj()
    {
        System.out.println("Rusza");
    }
}

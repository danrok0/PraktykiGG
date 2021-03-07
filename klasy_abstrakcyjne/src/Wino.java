public class Wino implements wino2
{
    public int rocznikWina;
    public String NazwaMarkiWina;

    @Override
    public void rocznikWina()
    {
        System.out.println("1997");
    }

    @Override
    public void NazwaMarkiWina()
    {
        System.out.println("Torres");
    }
}
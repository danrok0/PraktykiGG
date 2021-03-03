public class Trojkat
{
    private int bokA;
    private int podstawa;
    private int wysokosc;
    private int pole;
    private int obwodT;

    public Trojkat(int bokA, int podstawa, int wysokosc) {
        this.bokA = bokA;
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }
    void obliczPole() {
        System.out.println(podstawa*wysokosc/2);
    }
    void obwodT() {
        System.out.println(podstawa+getBokA()+getBokA());
    }
    public int getBokA() {
        return bokA;
    }
    public void setBokA(int bokA) {
        this.bokA = bokA;
    }
    public int getPodstawa() {
        return podstawa;
    }
    public void setPodstawa(int podstawa) {
        this.podstawa = podstawa;
    }
    public int getWysokosc() {
        return wysokosc;
    }
    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }
}

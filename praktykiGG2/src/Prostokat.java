public class Prostokat
{

    private int bokA;
    private int bokB;
    private int pole;
    private int przekatne;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public int getPole() {
        return bokA*bokB;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getPrzekatne() {
        return bokA*bokA+bokB*bokB;
    }

    public void setPrzekatne(int przekatne) {
        this.przekatne = przekatne;
    }
}
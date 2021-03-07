public class Prostokat extends Figura
{
    public double bokA;
    public double bokB;
    double poleProstokata;

    public Prostokat(double bokA, double bokB) {
        this.bokB = bokA;
    }

    public Prostokat(double poleProstokata) {
        this.poleProstokata = poleProstokata;
        poleProstokata = bokA * bokB;
    }
}
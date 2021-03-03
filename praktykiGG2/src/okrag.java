public class okrag
{
    private double promien;
    private double pole;
    private double srednica;

    public okrag(double promien) {
        this.promien = promien;
    }

    public okrag(int i) {
    }

    void setSrednica() {
        System.out.println(promien * 2);
    }
    void setPole() {
        System.out.println(promien * promien * 3.14);
    }
    void obwodkola() {
        System.out.println(2*3.14*promien);
    }
}
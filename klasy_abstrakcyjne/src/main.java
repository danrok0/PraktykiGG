public class main {
    public static void main(String[] args) {
        //Zadanie 1
        Zwierze zwierze = new Zwierze() {

            @Override
            public void badzMilutki() {

            }

            @Override
            public void wiek() {
            }

            @Override
            public void nazwa() {
            }
        };
        zwierze.sprawdzCzyZyje();
        zwierze.czyMaCzrnąSierść();
        System.out.println();

        //zadanie 2
        Samochod samochod = new Samochod();
        samochod.skrecwLewo();
        samochod.ruszaj();
        System.out.println();
        //zadanie 3
        Wino wino = new Wino();
        wino.NazwaMarkiWina();
        wino.rocznikWina();
        System.out.println();
        //Zadanie 5
        Kwadrat kwadrat=new Kwadrat(10);
        kwadrat.obliczpole();
        kwadrat.obliczobw();
        //Zadanie 4
        Pies pies = new Pies();
        pies.badzMilutki();
        pies.bawSie();
        System.out.println();
    }
}
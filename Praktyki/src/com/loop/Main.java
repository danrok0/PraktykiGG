package loop;

public class Main {
    public static void main(String[] args)
    {
        //Zadanie 1

        char pierwszaLitera = 'A';

        for (int i = 0; i < 26; i++)
        {
            if ( i % 2 == 0)
                System.out.print(pierwszaLitera + "\t");
            pierwszaLitera++;
        }
    


        //Zadanie 2

    int f,g,h;
f = g = 1;
int numberOfCalculations = 10;
System.out.print(f + "\t" + g + "\t");
for (int i =0; i < numberOfCalculations;i++){
    h = f + g;
    f = g;
    g = h;
    System.out.print(h + "\t");
        }

    }

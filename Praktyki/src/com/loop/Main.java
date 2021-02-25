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
    }
}

        //Zadanie 2

    class FibonacciExample1{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }}
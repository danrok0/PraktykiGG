package trójkąt;
//zadanie 5
public class trojkat
{
    public static void main(String[] args)
    {
        int wysokoscTrojkata = 5;


        for (int i = 0; i < wysokoscTrojkata; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}

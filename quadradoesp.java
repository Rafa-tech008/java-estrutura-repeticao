// Ex.31 Calcule e mostre o quadrado dos números entre 10 e 150;
package ESTRep;

public class quadradoesp
{
    public static void main(String args[])
    {
        int x =10;
        double pot;
        while (x<=150)
        {
            pot= Math.pow(x,2);
            System.out.println("O quadrado de " +x+ " equivale a: " +pot);
            x++;
        }
    }
}
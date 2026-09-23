// Ex.35 Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores;
package ESTRep;

import javax.swing.JOptionPane;
public class somatimpar
{
    public static void main (String args[])
    {
        int x, y, i, somat=0;
        x= Integer.parseInt(JOptionPane.showInputDialog("Digite um termo inicial: "));
        y= Integer.parseInt(JOptionPane.showInputDialog("Digite um termo final: "));
        for (i=x; i<=y; i++)
        {
            if (i%2!=0)
            {
                somat+=i;
            }
        }
        System.out.println ("O valor da somatória equivale a: " +somat);
    }
}
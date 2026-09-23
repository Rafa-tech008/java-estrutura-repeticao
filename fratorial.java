// Ex.33 Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N;
package ESTRep;

import javax.swing.JOptionPane;
public class fratorial
{
    public static void main (String args[])
    {
       double x, op, ac=0;
        x= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para cálculos das frações: "));
        do
        {
            op= 1/x;
            ac+=op;
            x--;
        }while (x>=1);
        System.out.println("O valor equivale a: " +ac);
    }
}
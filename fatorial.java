// Ex.32 Receba um número inteiro. Calcule e mostre o seu fatorial;
package ESTRep;

import javax.swing.JOptionPane;
public class fatorial
{
    public static void main(String args[])
    {
        int i, x, fat=1;
        x= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para x: "));
        for(i=1; i<x;)
        {
            fat= fat*x;
            x--;
        }
        System.out.println("O resultado do fatorial equivale a: " +fat);
    }
}

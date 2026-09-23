// Ex.36 Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!;
package ESTRep;

import javax.swing.JOptionPane;
public class fracaocomfat
{
    public static void main(String args[])
    {
        int x, fat=1;
        double ac=1.0;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a x: "));
        for (int i=1; i<=x; i++)        
        {
            fat= fat*i;
            ac+=1.0/fat;
            }
        System.out.println("O valor da sequência equivale a: " +ac);
    }
}
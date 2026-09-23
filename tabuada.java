// Ex.34 Receba um número. Calcule e mostre os resultados da tabuada desse número;
package ESTRep;

import javax.swing.JOptionPane;
public class tabuada
{
  public static void main(String args[])
  {
      int i, x, tab;
      x= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
      for (i=1;i<11;i++)
      {
          tab=x*i;
          System.out.println("O valor de " +x+ " por " +tab);
      }
  }
}
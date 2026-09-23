// Ex.44 Receba o número da base e do expoente. Calcule e mostre o valor da potência;
package ESTRep;

import javax.swing.JOptionPane;
public class potencia 
{
	public static void main (String args[])
	{
		int base, exp, pot=0;
		base=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para ser a base: "));
		exp=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para expoente: "));
		if (exp==0)
		{
			pot=1;
			System.out.println("O valor da potência equivale a: " +pot);
		}
		else
		{
			if (exp==1)
			{
				pot += base;
				System.out.println("O valor da potência equivale a: " +pot);
			}
			else
			{
				if (exp>1)
				{
					pot = base;
					while (exp>1)
					{
						pot= pot*base;
						exp= exp-1;
					}
					System.out.println("O valor da potência equivale a: " +pot);
				}
			}
		}
	}
}

// Ex.40 Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles;
package ESTRep;

import javax.swing.JOptionPane;
public class primos 
{
	public static void main (String args[])
	{
		int i, j,  v1, v2, primos=0;
		v1=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para abrir o intervalo: "));
		v2=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para fechar o intervalo: "));
		if (v2>v1)
			{
				for (i=v1; i<v2; i++)
				{
					if (i>1)
					{
						primos=1;
						for (j=2; j<i; j++)
						{
							if (i%j==0)
							{
								primos = 0;
								break;
							}
						}
						if (primos == 1) 
						{
						System.out.println("Os números primos equivalem a: " +i);
						}
					}
				}
			}
			else
		{
			for (i=v2; i<v1; i++)
			{
				if (i>1)
				{
					primos=1;
					for (j=2; j<i; j++)
					{
						if (i%j==0)
						{
							primos=0;
							break;
						}
					}
					if (primos == 1) 
					{
						System.out.println("Os números primos equivalem a: " +i);		
					}
				}
			}
		}
	}
}
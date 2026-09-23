// Ex.39 Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
//Casa: 	1	2	3	4	...	64;
//Qdte:	1	2	4	8	...	N;
package ESTRep;

import javax.swing.JOptionPane;
public class xadrezegraos 
{
	public static void main (String args[])
	{
		int casas, cont=2, graos=1;
		casas=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de casas desejadas: "));
		if (casas>64 || casas<=0)
		{
			casas=Integer.parseInt(JOptionPane.showInputDialog("Valor inválido, digite outro: "));
			while (casas>64 || casas<=0)
			{
				casas=Integer.parseInt(JOptionPane.showInputDialog("Valor inválido, digite outro: "));
			}
		}
		else
		{
			if (casas==1)
			{
				System.out.println("A casa " +casas+ " equivale a quantidade de "+graos+ " grão;");
			}
			else
			{
				System.out.println("A casa " +(cont-1)+ " equivale a quantidade de " +graos+ " grão;");
				while (casas>=cont)
				{
					graos=graos*2;
					System.out.println("A casa " +cont+ " equivale a quantidade de " +graos+ " grãos;");
					cont += 1;
			}

			}
		}
	}
}

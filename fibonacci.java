// Ex.37 Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo;
package ESTRep;

import javax.swing.JOptionPane;
public class fibonacci 
{
	public static void main (String args[])
	{
		int a=0, b=1, i, fib = 0, cont;
		cont=Integer.parseInt(JOptionPane.showInputDialog("Digite o número para até onde irá a sequência: "));
		if (cont==0)
		{
			System.out.println("Termo inválido.");
		}
		else
		{
			if (cont==1 || cont == 2)
			{
				fib=1;
				System.out.println("O termo " +cont+ "da sequência fibonacci, equivale a: " +fib);
			}
			else
			{
				i=cont;
				while (i>1)
				{
					fib=a+b;
					a=b;
					b=fib;
					i= i-1;
				}
				System.out.println("O termo " +cont+ " da sequência fibonacci, equivale a: " +fib);
			}
		
		}
	}
	
}

// Ex.38 Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos;
package ESTRep;

import javax.swing.JOptionPane;
public class cemnummaiormenor 
{
	public static void main (String args[])
	{
		int cont=100, valor, maior=0, menor=99999999;
		do
		{
			valor=Integer.parseInt(JOptionPane.showInputDialog("Digite um novo valor: "));
			if (valor<0)
			{
				valor=Integer.parseInt(JOptionPane.showInputDialog("Inválido, digite novamente: "));
				while (valor<0) 
				{
					valor=Integer.parseInt(JOptionPane.showInputDialog("Inválido digite novamente"));
				}
			}
			if (maior<valor)
			{
				maior = valor;
			}
			if (menor>valor)
			{
				menor = valor;
			}
			cont=cont-1;
			
		}while(cont>1);
		System.out.println("O maior número da sequência, equivale a: " +maior);
		System.out.println("O menor número da sequência, equivale a: " +menor);
	}
	
}

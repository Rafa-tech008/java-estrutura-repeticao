// Ex.41 Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7;
package ESTRep;

public class somasresultem7 
{
	public static void main (String args[])
	{
		int i, j, soma;
		for (i=0; i<=7; i++)
		{
			for (j=0; j<=7; j++)
			{
				soma = i+j;
				if (soma==7)
				{
					System.out.println(i+ "+" +j+ "= 7");
				}
			}
		}
	}
}

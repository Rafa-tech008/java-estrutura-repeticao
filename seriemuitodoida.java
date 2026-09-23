// Ex.45 Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225;
package ESTRep;

public class seriemuitodoida 
{
	public static void main(String args[])
	{
		int i=1, j, k;
		double div, ac=0;
		for (j=1; j<=15; j++)
		{
			k= j*j;
			div= (double) i/k;
			if (k%2!=0)
			{
				ac += div;
			}
			else
			{
				ac-=div;
			}
			System.out.println(i+ "/" +k+ "=" +ac);
			i += 1;
		}
		System.out.println("O valor total equivale a: " +ac);
	}
}

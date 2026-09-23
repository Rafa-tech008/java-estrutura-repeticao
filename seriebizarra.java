// Ex.42 Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99;
package ESTRep;

class seriebizarra 
{
	public static void main(String args[])
	{
		int i, j=1;
		double ac=0, div;
		for (i=1; i<=50; i++)
		{
			div= (double) i/j;
			ac += div;
			System.out.println(i+ "/" +j);
			j= j+2;
		}
		System.out.println("O valor total equivale a: " +ac);
	}
}

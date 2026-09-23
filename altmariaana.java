// Ex.43 Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano;
package ESTRep;

public class altmariaana 
{
	public static void main(String args[])
	{
		int ana=110, mar=150, anos=0;
		do
		{
			ana= ana+3;
			mar= mar+2;
			anos += 1;
		}while (ana<=mar);
		System.out.println("Ana terá " +ana+ "cm depois de " +anos+ " anos, sendo maior que Maria, que terá " +mar+ "cm");
	}
}

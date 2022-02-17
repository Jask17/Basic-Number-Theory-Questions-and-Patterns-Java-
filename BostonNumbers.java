package practicespace;

import java.util.Scanner;

public class BostonNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		scn.close();
		System.out.println(Primefactsum(num)+"-"+Digitsum(num));
		if(Primefactsum(num)==Digitsum(num))
		{
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	
		// TODO Auto-generated method stub

	}
	
	public static int Primefactsum(int a)
	{
		int fact=2;
		int factsum=0;
		while(a>1)
		{
			if(a%fact==0)
			{
				factsum=factsum + Digitsum(fact);
				a=a/fact;
				
			}
			else
			{
				fact=fact+1;
			}
		}
		
		return factsum;
	}
	
	public static int Digitsum(int a)
	{
		int Dsum=0;
		while(a>0)
		{
			int digit=a%10;
			Dsum=Dsum+ digit;
			a=a/10;
			
		}
	 return(Dsum);	
	}
	

}

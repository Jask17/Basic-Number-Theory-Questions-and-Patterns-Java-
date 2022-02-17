package practicespace;

import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) {
		System.out.println("Enter upto how many number you need primes");
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		scn.close();
		int i=2;
		while(i<=N)
		{
			
			if(CheckPrime(i)==0)
			{
				System.out.println(i);
				i++;
			
			}
			else {
				i++;
			}


			
			
			
		}
	

	}
	
	public static int CheckPrime(int n)
	{
		int flag=0;
		int i=2;
		while(i<n)
		{
			if(n%i==0)
			{
				flag=1;
		
			}
			i++;
		}
		if(flag==0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	
	}

}

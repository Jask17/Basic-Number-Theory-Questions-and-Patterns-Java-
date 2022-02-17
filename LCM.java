package practicespace;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		System.out.println("Enter two numbers for which you need LCM");
		Scanner scn=new Scanner(System.in);
		int N1=scn.nextInt();
		int N2=scn.nextInt();
		scn.close();
		int num=N1*N2;
		int ans=num/GCD(N1,N2);
		System.out.println(ans);
		
		
		
		
		

	}
	
	public static int GCD(int a,int b)
	{
		int dividend=0;
		int devisor=0;
		int rem=0;
		if(a>b)
		{
			dividend=a;
			devisor=b;
			
		}
		else
		{
			dividend=b;
			devisor=a;
		}
		
		while(devisor>0)
		{
			rem=dividend%devisor;
			dividend=devisor;
			devisor=rem;
			
		}
		return dividend;
	}

}

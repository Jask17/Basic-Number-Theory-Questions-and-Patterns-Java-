package practicespace;

import java.util.Scanner;

public class PrintArmstrong {

	public static void main(String[] args) {
		System.out.println("Enter a number till you want Armstrong numbers to be printed");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		scn.close();
		for(int i=0;i<n;i++)
		{
			if(IsArm(i))
			{
				System.out.println(i);
			}
		}
		

	}
	
	public static boolean IsArm (int num)
	{
		int copy=num;
		int sum=0;
		int nd=nofdigi(num);
		while(num>0)
		{
			int digi=num%10;
			num=num/10;
			sum+=Math.pow(digi, nd);
		}
		return copy==sum;
	}
	
	public static int nofdigi(int num)
	{
		int ans=0;
		while(num>0)
		{
			num=num/10;
			ans++;
		}
		return ans;
	}

}

package practicespace;

import java.util.Scanner;

public class Checkprime {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int flag=0;
		scn.close();
		if(num==0||num==1)
		{
			System.out.println("Not Prime");
			
		}
		int i=2;
		while(i<num)
		{
			if(num%i==0)
			{
				
				flag=1;
				
			}
			
			
			i++;
		}
		if(flag==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	    
		
	

	}

}

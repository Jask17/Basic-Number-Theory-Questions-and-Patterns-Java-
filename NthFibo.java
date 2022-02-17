package practicespace;

import java.util.Scanner;

public class NthFibo {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number till you need Fibonnaci series");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		scn.close();
		int i=1;
		int a=0;
		int b=1;
		
		while(i<=num+1)
		{   
			int c=a+b;
			if(i==num+1)
			{
				System.out.println(a);
			}
			a=b;
			b=c;
			
			i++;
		}

	}

}

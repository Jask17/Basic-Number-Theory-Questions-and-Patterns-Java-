package practicespace;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		System.out.println("Enter a Number and Digit");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int digit=scn.nextInt();
	
		int i=0;
		while(num>0)
		{
			int d=num%10;
			if(d==digit)
			{
				i++;
				
			}
			num=num/10;
			
		}
		System.out.println(i);
	

	}

}

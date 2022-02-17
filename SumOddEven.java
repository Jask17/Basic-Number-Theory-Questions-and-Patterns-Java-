package practicespace;

import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		System.out.println("Enter a number to find the sum of it odd and even digits");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int oddsum=0;
		int evensum=0;
		int pos=0;
		
		while(n>0)
		{
			int digit=n%10;
			n=n/10;
			pos++;
			if(pos%2==0)
			{
				evensum+=digit;
			}
			else
			{
				oddsum+=digit;
			}
		}
		System.out.println(oddsum);
		System.out.println(evensum);
		
		
		
		// TODO Auto-generated method stub

	}

}

package practicespace;

import java.util.Scanner;

public class OddEvenBackinDelhi {

	public static void main(String[] args) {
		System.out.println("Enter numbers of cars to be checked and their numbers");
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-- >0)
		{
			int n=scn.nextInt();
			int pos=0;
			int evensum=0;
			int oddsum=0;
			while(n>0)
			{
				int dig=n%10;
				n=n/10;
				pos++;
				if(pos%2==0)
				{
					evensum+=dig;
				}
				else
				{
					oddsum+=dig;
				}
			}
			System.out.println(evensum+"-"+oddsum);
			if(oddsum%3==0|| evensum%4==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			System.out.println(evensum%4);
		}
		// TODO Auto-generated method stub

	}

}

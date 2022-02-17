package practicespace;

import java.util.*;

public class Simpinput {

	public static void main(String[] args) {
		System.out.println("Enter a list of numbers");
		Scanner scn=new Scanner(System.in);
		int n=0;
		int sum=0;
		
		while(true)
		{
			n=scn.nextInt();
			sum=sum+n;
			if(sum<0)
			{
				break;
			}
			System.out.println(n);
			
			
		}
		
		// TODO Auto-generated method stub

	}

}

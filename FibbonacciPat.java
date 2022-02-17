package practicespace;

import java.util.Scanner;

public class FibbonacciPat {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int ntp=0;
		int a=0;
		int b=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				ntp=a+b;
				System.out.print((a)+"\t");
				cst++;
				
				 
				a=b;
				b=ntp;
				
			}
			
			System.out.println();
			row++;
			nst++;
			
		}
		// TODO Auto-generated method stub

	}

}

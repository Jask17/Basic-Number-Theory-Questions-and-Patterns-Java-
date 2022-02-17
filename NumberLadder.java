package practicespace;

import java.util.Scanner;

public class NumberLadder {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int ntp=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print((ntp++)+"\t");
				cst++;
			}
			
			
			System.out.println();
			row++;
			nst++;
			
		}
		
		// TODO Auto-generated method stub

	}

}

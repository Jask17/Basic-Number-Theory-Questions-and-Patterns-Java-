package practicespace;

import java.util.Scanner;

public class HollowDaimond {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nsta=(int)Math.floor(n/2);
		int nsp=1;
		int nstb=(int)Math.floor(n/2);
		while (row<=n)
		{
			int cst=1;
			while(cst<=nsta)
			{
				System.out.print("*\t");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				if(csp==1||csp==nsp)
				{
					System.out.print("*\t");
					
				}
				else {
					System.out.print("\t");
				}
				csp++;
				
			}
			cst=1;
			while(cst<=nstb)
			{
				System.out.print("*\t");
				cst++;
			}
			
			System.out.println();
			row++;
			if(row>n/2+1)
			{
				nsta++;
				nstb++;
				nsp-=2;
			}
			else {
				
				nsta--;
				nstb--;
				nsp+=2;
			}
		}
		// TODO Auto-generated method stub

	}

}

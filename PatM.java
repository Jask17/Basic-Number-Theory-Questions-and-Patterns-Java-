package practicespace;

import java.util.Scanner;

public class PatM {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scn.nextInt();
		int nsta=0;
		int nstb=0;
		int nsp=2*n-1;
		int row=1;
		int ntp=1;
		int ntpp=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nsta)
			{
				System.out.print("\t"+ntp++);
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				if(csp==1||csp==nsp)
				{
				System.out.print("\t"+ntpp);
				}
				else
				{
					System.out.print("\t");
				}
				csp++;
			}
			cst=1;
			 ntp=1;
			while(cst<=nstb)
			{
				System.out.print("\t"+ntp++);
				cst++;
			}
			
			System.out.println();
			row++;
			nsta++;
			nstb++;
			nsp=nsp-2;
			ntpp++;
			ntp=1;
			
		}
		
		// TODO Auto-generated method stub

	}

}

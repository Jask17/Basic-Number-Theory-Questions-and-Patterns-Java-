package practicespace;

import java.util.Scanner;

public class Patmagic {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value for Rows");
		int n=scn.nextInt();
		scn.close();
		int row=1;
		int nsta=n-1;
		int nsp=1;
		int nstb=n-1;
		while( row<=2*n-1)
		{
			int cst=1;
			while(cst<=nsta)
			{
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
			 if (csp==1||csp==nsp) {System.out.print("*");}
			 
			 else {	System.out.print(" ");}
				csp++;
			}
			cst=1;
			while(cst<=nstb)
			{
				System.out.print("*");
				cst++;
			}
			 
		
		System.out.println();
		row++;
		int a=2*n-1;
		if(row>a/2+1) {nsta++;nsp=nsp-2;nstb++;}
		else {nsta--;nsp=nsp+2;nstb--;}
		}
		// TODO Auto-generated method stub

	}

}

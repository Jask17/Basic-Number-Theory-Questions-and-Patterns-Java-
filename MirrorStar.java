package practicespace;

import java.util.Scanner;

public class MirrorStar {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=0;
		int nsp=(int)Math.floor(n/2);
		int nst=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*\t");
				cst++;
			}
			
			System.out.println();
			row++;
			if (row>n/2)
			{
				nst-=2;
				nsp+=1;
			}
			else {
				nst+=2;
				nsp-=1;
			}
		}
		
		// TODO Auto-generated method stub

	}

}

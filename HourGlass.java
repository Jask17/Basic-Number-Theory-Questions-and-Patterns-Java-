package practicespace;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scn.nextInt();
		int row=1;
		int nsp=0;
		int nst=2*n+1;
		int ntp=n;
		int a=2*n+1;
		while(row<=2*n+1)
		{
			int csp=1;
			while(csp<=nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst=1;
            ntp=ntp+1;
			while(cst<=nst)
			{
				if(cst>nst/2+1)
				{   
					System.out.print((++ntp)+"\t");
				}
				else {
				
				System.out.print((--ntp)+"\t");
				}
				cst++;
			}
			
			System.out.println();
			row++;
			
			if(row>a/2+1)
			{
				nst+=2;
				nsp--;
				ntp++;
			}
			else {
				nst-=2;
				nsp++;
				ntp--;
			}
		}
		// TODO Auto-generated method stub

	}

}

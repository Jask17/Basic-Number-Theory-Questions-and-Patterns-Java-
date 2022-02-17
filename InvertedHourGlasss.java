package practicespace;

import java.util.Scanner;

public class InvertedHourGlasss {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scn.nextInt();
		int row=1;
		int nsta=0;
		int nstb=0;
		int nsp=2*n+1;
		int a=2*n+1;
		int ntp=n;
		int ntpb=n;
		while(row<=2*n+1)
		{ 
			
			int cst=1;
			while(cst<=nsta)
			{
				System.out.print(ntpb--+" ");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				if(csp==1||csp==nsp)
				{
					System.out.print(ntp+" ");
				}
				else
				{
				System.out.print("  ");
				}
				csp++;
				
			}
			cst=1;
			while(cst<=nstb)
			{
				System.out.print(++ntpb+" ");
				cst++;
			}
			
			
			
			
			
			System.out.println();
			row++;
			if(row>a/2+1)
			{
				nsta--;
				nstb--;
				nsp+=2;
				ntp++;
				
			}
			else {
				nsta++;
				nstb++;
				nsp-=2;
				ntp--;
			}
		}
		// TODO Auto-generated method stub

	}

}

package practicespace;

import java.util.Scanner;

public class Darrow {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nspa=n-1;
		int nsta=0;
		int nspb=1;
		int nstb=0;
		int ntp=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nspa)
			{
				System.out.print("  ");
				csp++;
			}
			int cst=1;
		
			while(cst<=nsta)
			{
				System.out.print(ntp--+" ");
				cst++;
			}
			csp=1;
			while(csp<=nspb)
			{
				if(csp==1||csp==nspb)
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
				System.out.print(++ntp+" ");
				cst++;
			}
			
			
			
			System.out.println();
			row++;
			if(row>n/2+1)
			{
				nsta-=1;
				nspa+=2;
				nspb-=2;
				nstb-=1;
				ntp--;
			}
			else
			{
				nsta+=1;
				nspa-=2;
				nspb+=2;
				nstb+=1;
				ntp++;
			}
		}
		// TODO Auto-generated method stub

	}

}

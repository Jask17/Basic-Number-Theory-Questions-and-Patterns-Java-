package practicespace;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=scn.nextInt();
		int row=1;
		int nsp=n-1;
		int nst=1;
		int ntp=1;
		while(row<=2*n-1)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
		    int cst=1;
		    int ntpd=ntp-1;
		    while(cst<=nst)
		    {   
		    
		    	if(cst>nst/2+1)
		    	{
		        System.out.print(--ntpd+" ");
		    	}
		    	else {
		    		System.out.print((++ntpd)+" ");
		    	}
		        cst++;
		       
		    }
			System.out.println();
			row++;
			ntp++;
			int a=2*n-1;
			if (row>a/2+1)
			
			{
				nst=nst-2;
				nsp++;
			}
			else
			{
				nst=nst+2;
				nsp--;
				
			}
			
		}
		
		// TODO Auto-generated method stub

	}

}

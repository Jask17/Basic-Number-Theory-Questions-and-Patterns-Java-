package practicespace;

import java.util.Scanner;

public class p3 {
	 public static void main(String args[]) {
	        Scanner scn=new Scanner(System.in);
	        System.out.println("Enter no of rows");
	        int n=scn.nextInt();
	        scn.close();
	        int nsp=n-1;
	        int nst=n;
	        int row=1;
	        while(row<=n)
	        {
	            int csp=1;
	            while(csp<=nsp)
	            {
	                System.out.print(" ");
	                csp++;
	            }
	            int cst=1;
	            while(cst<=nst)
	            {
	                if(row==1||row==n||cst==1||cst==nst)
	                {System.out.print("*");}
	                else{System.out.print(" ");}

	                cst++;
	            }


	            System.out.println();
	            row++;
	            nsp--;
	        }


	    }

}

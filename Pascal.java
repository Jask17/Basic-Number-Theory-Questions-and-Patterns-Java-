package practicespace;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=0;
		int nst=0;
		
		while(row<n)
		{
			int  cst=0;
			int nck=1;
			while(cst<=nst)
			{   
				
			   
				System.out.print(nck+"\t");
				nck=nck*(row-cst)/(cst+1);
				
			 
				
				
				cst++;
			}
			
			
			System.out.println();
			row++;
			nst++;
			
		}
		// TODO Auto-generated method stub

	}
	
	

}

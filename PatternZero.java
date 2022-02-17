package practicespace;

import java.util.Scanner;

public class PatternZero {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int ntp=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				if(cst==1||cst==nst)
				{
					System.out.print(ntp+"\t");
				}
				else {
				System.out.print("0\t");
				}
				cst++;
			}
			
			System.out.println();
			row++;
			nst++;
			ntp++;
		}
		
		// TODO Auto-generated method stub

	}

}

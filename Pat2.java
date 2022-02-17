package practicespace;

import java.util.Scanner;

public class Pat2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("take number of rows");
		int N=scn.nextInt();
		scn.close();
		int row=1;
		int ntp=1;
		int nst=1;
		while(row<=N)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("\t*");
				
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}
		// TODO Auto-generated method stub

	}

}

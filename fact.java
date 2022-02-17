package practicespace;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nf=1;
		for(int i=1;i<n;i++)
		{
			nf=nf*(i+1);
		}
		System.out.println(nf);
		
		// TODO Auto-generated method stub

	}

}

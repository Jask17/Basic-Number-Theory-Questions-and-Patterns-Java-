package practicespace;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int min=scn.nextInt();
		int max=scn.nextInt();
		int step=scn.nextInt();
		scn.close();
		while(min<=max)
		{
			int ans=(5*(min-32))/9;
		   System.out.println(min+" "+ans);
			
			min+=step;
		}
		
		// TODO Auto-generated method stub

	}

}

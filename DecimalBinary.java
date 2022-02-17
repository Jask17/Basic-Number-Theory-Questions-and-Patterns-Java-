package practicespace;

import java.util.Scanner;

public class DecimalBinary {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		scn.close();
		int divid=n;
		int divz=2;
		int temp=0;
		int mult=1;
		while(divid>0)
		{
			int rem=0;
			rem=divid%divz;
			temp+=rem*mult;
			mult*=10;
			divid=divid/divz;
		}
		System.out.println(temp);
		
		// TODO Auto-generated method stub

	}

}

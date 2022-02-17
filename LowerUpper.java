package practicespace;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("e");
		char ch=scn.next().charAt(0);
		scn.close();
		if(ch>='a'&& ch<='z')
		{
			System.out.println("lowercase");
		}
		else if(ch>='A'&& ch<='Z')
		{
			System.out.println("UPPERCASE");
			
		}
		else {
			System.out.println("Invalid");
		}
	}
	
}		
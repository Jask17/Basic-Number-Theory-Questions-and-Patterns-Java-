package practicespace;

import java.util.Scanner;

public class InverseNum {

	public static void main(String[] args) {
		System.out.println("Enter a Number to Inverse");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		scn.close();
		int pos=0;
		int inv=0;
		while(num>0)
		{
			int digit=num%10;
			num=num/10;
			pos++;
			int new_num=(int)(Math.pow(10, digit-1)*pos);
			inv=inv+new_num;
		}
		System.out.println(inv);
	

	}

}

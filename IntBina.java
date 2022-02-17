package practicespace;

import java.util.Scanner;

public class IntBina {

	public static void main(String[] args) {
		System.out.println("Enter a num");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		scn.close();
		System.out.println(Integer.toBinaryString(n));
		// TODO Auto-generated method stub

	}

}

package practicespace;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		System.out.println("Enter operation followed by operands");
		Scanner scn=new Scanner(System.in);
		char ch;
		int n1=0;
		int n2=0;
		
		while(true)
		{
			 ch=scn.next().charAt(0);
			
			if(ch=='*')
			{
				 n1=scn.nextInt();
				 n2=scn.nextInt();
				
				System.out.println(Mult(n1,n2));
			}
			else if(ch=='+')
				
			{
				n1=scn.nextInt();
				 n2=scn.nextInt();
				
				System.out.println(Add(n1,n2));
			}
			else if(ch=='/')
			{
				n1=scn.nextInt();
				 n2=scn.nextInt();
				
				System.out.println(Divide(n1,n2));
			}
			else if(ch=='-')
			{
				n1=scn.nextInt();
				 n2=scn.nextInt();
				
				System.out.println(Subtract(n1,n2));
			}
			else if(ch=='%')
			{
				n1=scn.nextInt();
				 n2=scn.nextInt();
				
				System.out.println(Mod(n1,n2));
			}
			else if(ch=='x'||ch=='X')
			{
				break;
				
				
			}
			else
			{
				System.out.println("Invalid operation. Try again.");
				
			}
			
		}
	
		


	}


public static int Add(int a,int b)
{
	int ans=0;
	ans=a+b;
	return ans;
}
public static int Mult (int a,int b)
{
	int ans=0;
	ans=a*b;
	return ans;
}

public static int Divide(int a,int b)
{
	int ans=0;
	ans=a/b;
	return ans;
}

public static int Subtract(int a,int b)
{
	int ans=0;
	ans=a-b;
	return ans;
}
public static int Mod(int a,int b)
{
	int ans=0;
	ans=a%b;
	return ans;
}



}

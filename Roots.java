package practicespace;

import java.util.Scanner;

public class Roots {

	public static void main(String[] args) {
		System.out.println("Enter Coefficient of Quadratic Equation");
		Scanner scn=new Scanner(System.in);
		int  a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		scn.close();
		int D=(int)Math.pow(b, 2)-4*a*c;
		System.out.println(D);
		if (D==0)
		{
			System.out.println("Real and Equal");
		}
		else if (D>0)
		{
			System.out.println("Real and Distinct");
			
		}
		else
		{
			System.out.println("Imaginary");
		}
		
		if(D>=0)
		{
		double sqrtD=Math.sqrt(D);
       
		int  x=(int)(-b+sqrtD)/2*a;
		int y=(int)(-b-sqrtD)/2*a;
		
		if(x<y)
		{
			System.out.println(x+" "+y);
		}
		else
		{
			System.out.println(y+" "+x);
		}
		}
	}

}

package practicespace;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		System.out.println("Enter length of series and a Number that members of the series must not be multiple");
		Scanner scn=new Scanner(System.in);
		int N1=scn.nextInt();
		int N2=scn.nextInt();
		int ans=0;
		int i=1;
		int r=0;
		int T=0;
		
		while(true)
		{
			ans=3*(i)+2;
			if(ans%N2!=0)
			{
				System.out.println(ans);
				r++;
				if(r==N1)
				{
					break;
				}
				
				
				
			}
			
			
			i++;
			
				
			
		
		}
		
		
		
		// TODO Auto-generated method stub

	}

}

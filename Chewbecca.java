package practicespace;

import java.util.Scanner;

public class Chewbecca {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Give a number to chewbecca");
		
		long n=scn.nextLong();
		scn.close();
		int nz=0;
		int nzb=0;
		int nd=0;
		
		
		long temp=0;
		long ans=0;
		int iteration=0;
		
	   long	cofn=n;
	   while(cofn>0)
	   {
		   cofn=cofn/10;
		   nd++;
	   }
		while(n>0)
		{
			long digit=n%10;
			long R=(9-digit);
			if ((digit==0||digit==9)&& iteration!=nd-1)
			{
				nz++;
			}
			if(R==0&&iteration==nd-1) {temp=temp*10+digit;}
			else if(R<digit)
			{
				temp=temp*10+R;
				
				
			}
			
			else
			{
				temp=temp*10+digit;
			}
			n=n/10;
			iteration++;
			
		
		}

	
		while(temp>0)
		{
			long d=temp%10;
			if(d==0) {nzb++;}
			
			
		
			ans=ans*10+d;
			temp=temp/10;
		}
		System.out.println(nz);
		nz=nz-nzb;
		
		ans=ans*(long)Math.pow(10, nz);
		System.out.println(ans);
		System.out.println(nzb);
		
		

		}

}

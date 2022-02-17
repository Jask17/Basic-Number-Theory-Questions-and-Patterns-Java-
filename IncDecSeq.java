package practicespace;

import java.util.Scanner;

public class IncDecSeq {

	public static void main(String[] args) {
		System.out.println("Enter an Array");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int ele=1000000000;
		int i=1;
		int flag=0;
	

		boolean check=false;
		int flag2=0;
	
		while(i<=size)
			
		{    
			int temp=ele;
			ele=scn.nextInt();
			if(ele<temp && flag2!=3 )
			{
			
				check=true;
				flag=1;
				
		
			}
			else if(ele>temp && flag==1  )
			{
				check=true;
				flag=1;
				flag2=3;

			
			}
			else
			{
	            flag=0;
				check=false;
			}
			 
			
			
		
		i++;	
		}
		System.out.println(check);
		scn.close();
	
	

	}

}

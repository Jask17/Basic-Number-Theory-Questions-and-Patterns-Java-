package practicespace;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		System.out.println("Enter no of test cases");
		Scanner scn=new Scanner(System.in);
		
		int t=scn.nextInt();
		
		
		
	
		while(t-- >0)
		{
			int M=scn.nextInt();
			int N=scn.nextInt();
			int sm=1;
			int suma=0;
			int sumh=0;
		    boolean turn=true;
		    while(suma<=M&&sumh<=N) 	    		
			{	
		     if(turn)
		     {
		    	 suma+=sm;
		    	 sm++;
		    	 turn=false;
		     }
		     else
		     {
		    	 sumh+=sm;
		    	 sm++;
		    	 turn=true;
		     }
			}
		    
		    if(turn)
		    {
		    	System.out.println("Aayush");
		    }
		    else
		    {
		    	System.out.println("Harshit");
		    }
		  
			
		}
		scn.close();

	}

}

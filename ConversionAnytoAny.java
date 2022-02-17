package practicespace;

import java.util.Scanner;

public class ConversionAnytoAny {
	public static void main(String args[]) {
		System.out.println("Enter source base,destination base,number to be converted");
        Scanner scn=new Scanner(System.in);
        int sb=scn.nextInt();
        int db=scn.nextInt();
        int n=scn.nextInt();
        int Fans=0;
        int dec=0;
        dec=Basetodec(n,sb);
        Fans=Decton(dec,db);
        System.out.println(Fans);
        
    

    }

    public static int Basetodec(int n,int base)
    {
        int ans=0;
        int pos=0;
        while(n>0)
        {
            int digit=n%10;
            ans+=digit*(int)Math.pow(base,pos);
            n=n/10;
            pos++;
        }
        return ans;
    }


    public static int Decton(int n,int n2)
    {
    
		int divid=n;
		int divz=n2;
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
        return temp;

    }

}

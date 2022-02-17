package practicespace;

import java.util.Scanner;

public class Pat1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter no of rows:n");
        int n=scn.nextInt();
        scn.close();
        int row=1;
        int nsp=n-1;
        int nst=1;
        int ntp=1;
        while(row<=n)
        {
            int csp=1;
            while(csp<=nsp)
            {
                System.out.print("\t");
                csp++;
            }
            int cst=1;
            ntp=ntp-1;
            while(cst<=nst)
            {
                if(cst>nst/2+1){ System.out.print("\t"+(--ntp)); }
                else {System.out.print("\t"+(++ntp)); }
                cst++;

            }

            System.out.println();
            row++;
            nsp--;
            ntp++;
            nst=nst+2;
        }
		// TODO Auto-generated method stub

	}

}

package basic;

import java.util.Scanner;

public class PrintSumofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i,sum=0;
	        Scanner sc=new Scanner(System.in);
		    System.out.println("Enter range");
		   // i=sc.nextInt();
		    n=sc.nextInt();
		    for(i=1;i<=n;i++)
		    {
			 sum=sum+i;
			 System.out.println("sumof from 1to"+n+"is"+sum);
			
			
			
		    }
	}
}



	



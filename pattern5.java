package basic;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,rows;
		 System.out.println("Enter rows");
		 Scanner sc=new Scanner(System.in);
		 rows=sc.nextInt();
	     for(i=1;i<=rows;i++)                                    
	     {
		 for(j=1;j<=i;j++)  //for(j=1;j>=i;j++)
		    {  
		    	System.out.print(j);
		    }
		    System.out.println();
		    }
		   
		     
	}

}


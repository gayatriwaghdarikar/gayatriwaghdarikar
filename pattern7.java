package basic;
import java.util.Scanner;
public class pattern7 {
	public static void main(String[] args) {
		int i,j,k,no;
		 System.out.println("Enter rows");
		 Scanner sc=new Scanner(System.in);
		 no=sc.nextInt();
		  int count=0;
	     for(i=1;i<=2*no-1;i++)                                    
	     {
		 for(j=count;j<=no;j++)  
		    {  
		    	System.out.print(" ");
		    }
		 for(k=1;k<=count*2-1;k++)
		 {
		    System.out.print("*");
		 }
		 if(i<no)
			 count++;
		 else
			 count--;

		    System.out.println();
	     }    
		   
	}

}

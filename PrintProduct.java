package basic;
import java.util.Scanner;


public class PrintProduct {

	public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter range");
	    
	    n=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			if(i<=n)
		      {
				 System.out.println(n+"*"+i+"="+(i*n));
			}
		}


		// TODO Auto-generated method stub

	}

}

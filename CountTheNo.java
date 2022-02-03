package basic;

import java.util.Scanner;

public class CountTheNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,count=0;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number");
	    num=sc.nextInt();
	   // int count=0;
	    for(;num!=0;)
	    {    num=num/10;
	         count++;
	    	
	    }
	    System.out.println("Count the no of digits:"+count);
	}

}

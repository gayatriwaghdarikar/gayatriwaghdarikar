package basic;

import java.util.Scanner;

public class SumOfLastAndFirstDigit {

	public static void main(String[] args) 
	{int num,firstDigit,sum,LastDigit;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
   // i=sc.nextInt();
    num=sc.nextInt();
		// TODO Auto-generated method stub
     LastDigit=num%10;
     System.out.println("last digit:"+LastDigit);
     for(;num>=10;)
     {
    	 num=num/10;
     }
     firstDigit=num;
     System.out.println("first digit:"+firstDigit);
     System.out.println("sum of first and last digit:"+(firstDigit+LastDigit));
	}
	
	

}

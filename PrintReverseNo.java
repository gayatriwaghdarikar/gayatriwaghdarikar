package basic;

import java.util.Scanner;

public class PrintReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,remainder,reverse=0;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num>0)
		{ 
			remainder=num%10;
		reverse=reverse * 10 +remainder;
		num=num/10;
			
			
		}
		System.out.println("reverse no is"+reverse);
		

	}

}

package basic;

import java.util.Scanner;

public class PrintNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		System.out.println("enter range to print natural no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		

	}

}

package basic;

import java.util.Scanner;

public class PerfectNo1To100 
{
	public static void main(String[] args) 
	{
		int num,sum,i,j;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Range");
	    num=sc.nextInt();
	    for(i=1;i<=num;i++)
	    {
	    	sum=0;
	    for(j=1;j<i;j++)
	    {  
	    	if(i%j==0)
	    	{
	    	sum=sum+j;
	        
	    	}
	    }
	    if(sum==i)
	    System.out.println(i);
	   
	}
}
}



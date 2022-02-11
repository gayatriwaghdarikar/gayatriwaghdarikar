package oopExample;

import java.util.Scanner;

public class banktransaction {
	static Bank gayatri;

	public static void main(String[] args) {
		long withdraw,accbalance,damt;
		int accno,choice;
		String holderName;
		
		 Scanner sc=new Scanner(System.in);
		 do {   
			 
			 System.out.println("press 1.for create account\n press 2.for withdraw amount\n press 3.for deposit amount \n press 4.for check balance\n"
			 		+ "press 5.for quite");
			 System.out.println("==================================================================");
			 System.out.println("enter ur choice");
			 choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("enter account no");
				 accno=sc.nextInt();
				 
				 System.out.println("enter account holder name");
				 holderName=sc.next();
				 
				 System.out.println("enter balance");
				 accbalance=sc.nextLong();
				 
				 gayatri=new Bank(accno,holderName,accbalance);
				 System.out.println("ur account has been created");
				 System.out.println("==================================================================");
				 break;
			 case 2:
				 System.out.println("enter amount to withdraw");
				 withdraw=sc.nextLong();
				 
				 gayatri.withdraw(withdraw);
				 System.out.println("==================================================================");
				 break;
			 case 3:
				 System.out.println("enter amount to deposit");
				 damt=sc.nextLong();
				 gayatri.deposit(damt);
				 System.out.println("==================================================================");
                 break;
			 case 4: gayatri.checkbalance();
			 System.out.println("==================================================================");
			        break;
			 case 5:
				 break;
				 default:System.out.println("wrong choice");
				 System.out.println("==================================================================");

			 }
	} while(choice!=5);
		 System.out.println("thank you !visit again");

}
}

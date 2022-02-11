package oopExample;

 class Bank {
	 int accno;
	 String holderName;
	 long accbalance;

	public Bank(int accno,String holederName,long accbalance) {
		this.accno=accno;
		this.holderName=holederName;
		this.accbalance=accbalance;
		
		
	}
	public void withdraw(long wamount)
	{
		if(wamount<accbalance)
		{if(wamount>=500)
		{accbalance=accbalance-wamount;
		System.out.println(wamount+"withdraw has done sucessfully");
		}
		else
		{
			System.out.println("minimum withdrawl amount is 500");
		}
		}
	 else
	{
		System.out.println("insufficient balance !deposite first");
	}

} public void deposit(long damt)
	{
	accbalance=accbalance+damt;
	System.out.println("deposit is completed");
	}
public void checkbalance()
{
	System.out.println("account no:"+ this.accno);
	System.out.println("account holader name:"+this.holderName);
	System.out.println("account balance:"+this.accbalance);
}
 }

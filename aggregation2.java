package inhertanceExamples;
 class account_holder
 {
	 String name,address;
	 account acc;
	 public account_holder(String name,String address,account acc)
	 {
		 super();
		 this.name=name;
		 this.address=address;
		 this.acc=acc; 
	 }
	 public void display()
	 {
		 System.out.println("account holder name :" +name+" "+"address :"+address);
		 System.out.println("account no= :" +acc.acc_no+" "+" bank name :"+acc.bank_name);
			
	 }
 }
 

public class aggregation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account ac1=new account("axis bank",12345);
		account ac2=new account("hdfc",3456);
		account_holder ac=new account_holder("gayatri","solapur",ac1);
		account_holder gayatri=new account_holder("gayu","pune",ac2);
		ac.display();
		gayatri.display();

	}

}

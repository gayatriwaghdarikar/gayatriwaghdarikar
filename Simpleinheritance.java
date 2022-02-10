package InheritanceExamples;
class bank
{
	String bankname;
	public bank(String bankname) {
		this.bankname=bankname;
	}
	public int interest()
	{
		return 8;
	}
}
class sbi extends bank
{
	public sbi(String bankname) {
		super(bankname);
	}
	void display()
	{
		System.out.println("bankname:"+bankname);
	}
}

public class Simpleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi s=new sbi("state bank of india");
		s.display();
		System.out.println("interest:"+s.interest()+"%");

	}

}

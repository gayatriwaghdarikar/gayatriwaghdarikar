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
class employee extends sbi
{
	int bonus;
	public employee(String bankname,int bonus)
	{ super(bankname);
	this.bonus=bonus;
	}
	void display()
	{
		super.display();
		System.out.println("bonus:"+bonus);
		
	}
}

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee s=new employee("state bank of india",3000);
		s.display();
		System.out.println("interest:"+s.interest()+"%");

	}

}
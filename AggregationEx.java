package inhertanceExamples;
 class student
 {
	 int id;
	 String name;
	 Address  address;
	 public student(int id ,String name,Address address)
	 {
		 super();
		 this.id=id;
		 this.name=name;
		 this.address=address;
	 }
	 void display()
	 {
		 System.out.println("id :" +id+" "+"name :"+name);
		 System.out.println("city :" +address.city+" "+"state :"+address.state+" "+ "country :"+address.country);
	 }
	 
 }

public class AggregationEx {

	public static void main(String[] args) {
	Address add1=new Address("pune","mh","india");
	Address add2=new Address("solapur","mh","india");
	
	
	student s1=new student(10,"ram",add1);
	student s2=new student(12,"sham",add2);
	s1.display();
	s2.display();

	}

}

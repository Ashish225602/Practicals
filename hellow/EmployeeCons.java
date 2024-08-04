package hellow;

public class EmployeeCons {
	String name;
	int empid;
	
	EmployeeCons(){
		this.name();
		
		this.name = "Ashish";
		this.empid = 225602;
		System.out.println(name+" "+empid + " This is direct from defult constucter");
	}
	
	EmployeeCons(String name, int empid){
		this.name = name;
		this.empid = empid;
		System.out.println(name+" "+empid + " This is direct from Paramerise constucter");	
	}
	
	void Display(){
		System.out.println(name+" "+empid+"  this is from display method");			
	}
	
	void name() {
		System.out.println("name from name method");		
	}
	public static void main(String[] args) {
		
		EmployeeCons c = new EmployeeCons("Ashish",225602);
		new EmployeeCons("Sanika",1432);
		new EmployeeCons();	
		c.Display();
	
	}

}

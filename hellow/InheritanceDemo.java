package hellow;

class IDemo{
	
	String name = "Ashish";
	int Salary = 25000;
	
	public void show() {
		System.out.println("Function in IDEmo");
	}
}

class Employee extends IDemo{
	IDemo id = new IDemo();
	
	String Emp = id.name;
	int empId = 123;
	
	public Employee() {
		System.out.println(Emp);
		System.out.println(empId + "\n" );
	}
	
}

public class InheritanceDemo extends Employee {
	public static void main(String args[]) {
		IDemo id = new IDemo();
		Employee em = new Employee();
		
		id.show();
		System.out.println(id.name);
		System.out.println(id.Salary + "\n");
		
		
		//em.Empl();
		System.out.println(em.Emp + " Calling from main function");
		System.out.println(em.empId + " Calling from main function");
		
	
		
		
		
		
	}

}

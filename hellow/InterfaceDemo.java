package hellow;

interface abc{
	final int marks = 99;
	void display();
}

public class InterfaceDemo implements abc{
	public void display() {
		System.out.println("Hellow :) ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceDemo a = new InterfaceDemo();
		a.display();
		
		abc b = new InterfaceDemo();
		b.display();
		
		

	}

}

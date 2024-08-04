package hellow;
class mygen<T>{
	
	T BOX;
	
	void add(T word) {
		this.BOX = word;
	}
	T show() {
		return BOX;
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		// T in generic can mean anything... data type, object anything we can declare
		
		mygen<String> b = new mygen<String>();
		b.add("Ashish");
		System.out.println("Name of Candidate : "+ b.show());
		
		mygen<Integer> a = new mygen<Integer>();
		a.add(22);
		System.out.println("Age of candidate : " + a.show());
		
		mygen<Double> c = new mygen<Double>();
		c.add(8.90);
		System.out.println("CGPA is : " +c.show());
	} 
}

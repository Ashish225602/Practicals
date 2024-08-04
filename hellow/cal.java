package hellow;

class Calculater {
	int add(int a, int b) {
		return a+b;
	}
}

class adCalculater extends Calculater {
	int add(int a, int b,int c) {
		return a+b+c;
	}
}
public class cal {

	public static void main(String[] args) {
	
		adCalculater c = new adCalculater();
		
		int result = c.add(4, 5, 6);
		System.out.println("Adition of three number is : " + result);

	}

}

package hellow;

class opration{
	int square(int n) {
		return n*n;
	}
}

public class AggregationDemo {
	
	opration op;   //Aggregation  
	double pi = 3.14;
	double area(int radius) {
		op = new opration();
		int square = op.square(radius);
		return pi*square;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AggregationDemo ag = new AggregationDemo();
		double result = ag.area(5);
		System.out.println("Radious is : "+ result);
	}
}

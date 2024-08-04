package hellow;

public class hii {
	int code;
	String name;
	String city;
	
	hii(int code,String name,String city){
		
		this.code = code;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return "code : "+ code + ", name : "+ name + ", city : "+ city;
	}
	
	public static void main(String args[]) {
		
		hii h = new hii(225602,"Ashish","mumbai");
		hii h2 = new hii(001,"Vixon","Pochenki");
		
		System.out.println(h);
		System.out.println(h2);
	}

}

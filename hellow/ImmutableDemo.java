package hellow;

public class ImmutableDemo {
	private  String name;
	
	ImmutableDemo(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
    public static void main(String[] args) {
    	ImmutableDemo obj = new ImmutableDemo("Hello");
		System.out.println(obj.getName());
		
		obj.setName("Hello world");

	}
    

}

package hellow;

public class Constructer {
	
	
	 Constructer(){
		System.out.println("Default consterer i awake");
		
	}
	
	Constructer(int a,int b){
		System.out.println("parameterise  consterer i awake");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructer c = new Constructer();
		//Constructer c2 = new Constructer(5,6);
		new Constructer();

	}

}

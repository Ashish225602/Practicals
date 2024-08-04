package hellow;

public class AdloopForOdd {

	public static void main(String[] args) {
		// Get only odd number from array using advance loop
		
		 int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		
		 for(int num : arr) {

			 
			 if(num %2 == 0) {
				 continue;
			 }
			 System.out.println(num);
		 }

	}

}

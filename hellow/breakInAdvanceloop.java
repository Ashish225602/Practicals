package hellow;

public class breakInAdvanceloop {
	public static void main(String[] args) {
		//Write a program that use advance loop and break stetment to stop printing when specific element encountered in array o finteger

		int arr [] = {1,2,4,6,9,8};


		for(int number : arr) {
			
			if (number == 6) {
				break;
			}
			System.out.println(number);

		}
	}

}

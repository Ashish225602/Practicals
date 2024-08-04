package hellow;

import java.util.*;
public class studentScore {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your score : ");
		int s = sc.nextInt();
		
		if (s > 90 && s < 100) {
			System.out.println(" Gread : A");
		}
		else if (s > 80 && s < 89) {
			System.out.println(" Gread : B");
		}
		else if (s > 70 && s < 79) {
			System.out.println(" Gread : c");
		}
		else if (s > 60 && s < 69) {
			System.out.println(" Gread : D");
		}
		else if ( s < 60) {
			System.out.println(" Gread : F");
		}else{
			System.out.println("Enter valid Grade ");
		}
		sc.close();
	}
}

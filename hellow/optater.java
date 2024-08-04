package hellow;


import java.util.Scanner;

public class optater
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Bob";
		String y = "Cat";
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter username:");
		String uuid = s.next();
		
		System.out.print("Enter password:");
		String upwd = s.next();
		
		if ((uuid.equals(x) && upwd.equals(y)) || (uuid.equals(y) && upwd.equals(x))) 
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Failed");
		}
		s.close();
		
	}
}
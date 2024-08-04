package hellow;
//import java.util.Scanner;

public class FirstCLASS {
	public static void main(String[] args) {
		
		System.out.println("---------- Narrow Type casing ----------------------");
		double d = 42;
		float a = (float)d;
		long b = (long)d;
		int c = (int)d;
		short e = (short)d;
		byte f = (byte)d;

		System.out.println("original value :"+d);
		System.out.println(" float : "+a);
		System.out.println(" long : "+b);
		System.out.println(" int : "+c);
		System.out.println(" short : "+e);
		System.out.println(" byte : "+f);
		
		System.out.println("---------------- clear ------------------ \n");
		
		System.out.println("---------- Wide Type casing ----------------------");
		
		byte g = 4;
		short h = (short)g;
		int i = (int)g;
		long j = (long)g;
		float k = (float)g;
		double l = (double)g;
		
		System.out.println("original value :"+g);
		System.out.println(" short :"+h);
		System.out.println(" int :"+i);
		System.out.println(" long :"+j);
		System.out.println(" float :"+k);
		System.out.println(" double :"+l);

	}
}
package hellow;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		
		q.add("Ashish");
		q.add("Sanika");
		q.add("Vikas");
		q.add("Akash");
		q.add("Mukti");
		q.add("Mohan");
		
		System.out.println("the name :"+ q);
		
		System.out.println("Deleating name Mohan");
		q.remove("Mohan");
		System.out.println("the name :"+ q);
		System.out.println(q.contains("Mohan"));
		
		q.remove();
		System.out.println("the name :"+ q.element());
		System.out.println("the name :"+ q.peek());
		System.out.println("the name :"+ q);
		
		System.out.println("Elements in Queue:"+q);
		
		System.out.println("Removed element: "+q.remove());
		
		System.out.println("Head: "+q.element());
		
		System.out.println("poll(): "+q.poll());
		
		System.out.println("peek(): "+q.peek());
	
		System.out.println("Elements in Queue:"+q);
		
		
		
		


	}

}

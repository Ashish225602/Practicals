package hellow;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		
		class MyComparator implements Comparator<String> {
			@Override
			public int compare(String x, String y)
			{
				return x.length() - y.length();
			}
		}

		PriorityQueue<String> queue = new PriorityQueue<String>(15, new MyComparator());
		queue.add("Tyrion Lannister");
		queue.add("Daenerys Targaryen");
		queue.add("Arya Stark");
		queue.add("Petyr 'Littlefinger' Baelish");
		
		while (queue.size() != 0)
		{
			System.out.println(queue.poll());
		}


	}
}

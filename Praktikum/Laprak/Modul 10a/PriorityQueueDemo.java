import java.util.*;

public class PriorityQueueDemo {
	static PriorityQueue<String> stringQueue;
	public static void main(String[] args){
		stringQueue = new PriorityQueue<String>();
		stringQueue.add("ab");
		stringQueue.add("abcd");
		stringQueue.add("abc");
		stringQueue.add("a");
		
		while(stringQueue.size() > 0)
			System.out.println(stringQueue.remove());
	}
}
package coding_test;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_study {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.poll();
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}

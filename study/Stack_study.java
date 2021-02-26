package coding_test;

import java.util.*;

public class Stack_study {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(7);
		stack.push(8);
		stack.push(5);
		stack.pop();
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}

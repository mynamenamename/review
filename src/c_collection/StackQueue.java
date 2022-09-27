package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {

		// 1. 스택
                       // 뒤로가기 할때씀, 나중에 들어간 애가 먼저 뽑힌다
		Stack s = new Stack();
		// s.push(); 넣기
		s.push("A");
		s.push("B");
		s.push("C");

		// s.pop(); 뽑기
		System.out.println(s.pop());

		// 2. 큐 >> interface 자식 사용하기

		Queue q = new LinkedList();
		// q.offer(); 넣기
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		// q.poll(); 뽑기
		System.out.println(q.poll());

	}

}

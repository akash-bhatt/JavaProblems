package com.java.problems;


public class Stack {
	
	Node top = null;
	static int count = 0;
	
	void push(int value){
		
		Node obj = new Node();
		obj.a = value;
		obj.previous = top;
		top = obj;
		count++;
	}
	
	int pop () {
		
		int pop = top.a;
		top = top.previous;
		count --;
		return pop;
	}
	
	int peek () {
	
		return top.a;
	}
	
	
	
	
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Stack size:::" +count);
		System.out.println("Last element :::" +s.peek());
		System.out.println("popped element:::" +s.pop());
		System.out.println("Last element :::" +s.peek());
		System.out.println("Stack size:::" +count);
	
	}
	

}

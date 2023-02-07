package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> animal = new Stack<String>();
		
		//to add new element
		animal.push("Dog");
		animal.push("Horse");
		animal.push("Cat");
		
		System.out.println(animal);
		
		//to remove element
		System.out.println(animal.pop()); // work on LIFO principle to remove element
		
		System.out.println(animal.peek()); //to check element on top
	}

}

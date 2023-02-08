package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	// ArrayList - used to dynamically handle size for array
	// Internal Array size - 10
	public static void main(String[] args) {

		ArrayList<String> studentsName = new ArrayList<>();
		studentsName.add("Rakesh"); // add will add element end of the list

		List<Integer> list = new ArrayList<>();
		//List<Integer> list = new LinkedList<>(); - all methods will be same as ArrayList
		list.add(3);
		list.add(4);
		list.add(7);
		System.out.println(list);

		list.add(9);
		System.out.println(list);

		// add value at specific index
		list.add(2, 12);
		System.out.println(list);

		List<Integer> newList = new ArrayList<>();
		newList.add(150);
		newList.add(160);

		// Add List inside the list
		list.addAll(newList);
		System.out.println(list);

		// Get the element
		System.out.println(list.get(1));

		// Set the value to index
		list.set(2, 200);
		System.out.println(list);

		// check element present or not
		System.out.println(list.contains(4));

		// Remove element from the list
		list.remove(3); // with index value
		System.out.println(list);

		// Remove element with type of element
		list.remove(Integer.valueOf(150));
		System.out.println(list);

		// clear the list
		//list.clear();
		//System.out.println(list);
		
		//Ways to Iterate the list
		//1. For Loop
		for(int i=0;i<list.size();i++) {
			System.out.println("The Element is "+list.get(i));
		}
		
		//2. For Each
		for(Integer element : list) {
			System.out.println("Foreach Element is "+element);
			
		}
		
		//3. Iterator 
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println("Iterator "+it.next());
		}
	}
}
package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		// Set - will contain unique values

		// Set<Integer> set = new HashSet<>(); //is an unordered collection
		// Set<Integer> set = new LinkedHashSet<>(); // element will be in ordered way
		Set<Integer> set = new TreeSet<>(); // elements are in sorted order

		set.add(20); // add element
		set.add(3);
		set.add(45);
		set.add(23);

		System.out.println(set);

		set.remove(45); // remove element
		System.out.println(set);

		System.out.println(set.contains(23)); // check element present in Set or not
		System.out.println(set.isEmpty()); // check set is empty or not
		System.out.println(set.size()); // check size of set or no of element present

		set.clear();
		System.out.println(set);

	}
}
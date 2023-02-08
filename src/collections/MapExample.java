package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		// Map - store in key- value pair
		// Key is always unique

		Map<String, Integer> numbers = new HashMap<>();
		//Map<String, Integer> numbers = new TreeMap<>();  // will sort element on the basis of keys
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);

		numbers.put("Two", 23); // it will override the previous Two key value

		// if you want to put only if it's key is not present
		// 1.
		if (!numbers.containsKey("Two")) {
			numbers.put("Two", 24);
		}

		// 2.
		numbers.putIfAbsent("Two", 25);

		System.out.println(numbers);

		// Iterate
		for (Entry<String, Integer> e : numbers.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		for (String key : numbers.keySet()) {
			System.out.println(key); // Extract all keys
		}

		for (Integer val : numbers.values()) {
			System.out.println(val); // Extract all values
		}
		
		System.out.println(numbers.containsValue(23)); // check value present or not
		System.out.println(numbers.isEmpty());

	}
}
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(34);
		list.add(10);
		list.add(2);
		list.add(41);
		list.add(17);
		list.add(51);
		
		System.out.println("Min Element is = "+Collections.min(list));
		System.out.println("Max Element is = "+Collections.max(list));
		System.out.println("Freq of Element is = "+Collections.frequency(list, 34));
		
		//Sort the list
		Collections.sort(list);
		System.out.println(list);
		
		//Reverse the order of sorting
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		

	}
}
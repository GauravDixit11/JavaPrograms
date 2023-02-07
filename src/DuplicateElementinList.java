import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementinList {

	public static void main(String[] args) {
		 ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,6,8,9,1,2));
		 HashSet<Integer> checkSet = new HashSet<>();
		 HashSet<Integer> targetSet = new HashSet<>();
		 
		 for(Integer integer : arr) {
			 if(!checkSet.add(integer)) {
				 targetSet.add(integer);
			 }
			 
		 }
		 System.out.println("Duplicate in given list is/are:"+targetSet);
	}

}

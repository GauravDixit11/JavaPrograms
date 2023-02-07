import java.util.HashSet;
import java.util.Set;

public class DuplicateStringInArray {

	public static void main(String[] args) {

		String names[] = { "Java", "Python", "Ruby", "Java", "Python" };

		// Sol1
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if(names[i].equals(names[j])) {
				System.out.println("Duplicate Element is ::" + names[i]);
			}
		}
	}	
		// Sol2
		Set<String> set = new HashSet<String>(); // HashSet stores unique values only
		for(String name:names)
		{
			if (set.add(name) == false) {
				System.out.println("Duplicate Element is ::" + name);
			}
		}

	}

}
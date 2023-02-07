import java.util.HashSet;

public class DuplicateWordInString {

	public static void main(String[] args) {
		
		String str = "I am on leave on Tuesday";
		
		String[] str1 = str.split(" ");
		
		HashSet<String> hashSet = new HashSet<String>();
		
		for (String s : str1) {
			
			if(!hashSet.add(s)) {
				
				System.out.println(s);
			}
		}

	}

}

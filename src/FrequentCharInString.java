import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class FrequentCharInString {

	public static void main(String[] args) {
		frequentCharacter("Welcome");

	}
	
	private static void  frequentCharacter(String string) {
		HashMap<Character,Integer> hashMap = new HashMap <Character,Integer> ();
		
		char[] ch = string.toCharArray();
		
		for(Character c : ch)
			if(!hashMap.containsKey(c)) {
				hashMap.put(c, 1);
			}
			else {
				hashMap.put(c, hashMap.get(c)+1);
			}
		
		int max = Collections.max(hashMap.values());
		
		for(Entry<Character,Integer> entry : hashMap.entrySet() ) {
			
			if(max==entry.getValue()) {
				System.out.println(entry.getKey()+"--->"+entry.getValue());
			}
		}
	}

}

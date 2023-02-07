import java.util.Arrays;

public class Anagram {
	// Anagram: a word, phrase, or name formed by rearranging the letters of
	// another, such as spar, formed from rasp

	public static void main(String[] args) {

		String s = "bcd";
		String s1 = "abc";
		// Output: false

		char ar[] = s.toCharArray();
		char br[] = s1.toCharArray();

		if ((ar.length) == (br.length)) {

			Arrays.sort(ar);
			Arrays.sort(br);

			for (int i = 0; i < ar.length; i++) {
				if (ar[i] != br[i]) {
					System.out.println("Not Anagram");
					break;
				}

				else {
					System.out.println("Anagram");
					break;

				}
			}
		}
	}
}

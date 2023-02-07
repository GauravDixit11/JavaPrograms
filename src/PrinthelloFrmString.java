
public class PrinthelloFrmString {

	public static void main(String[] args) {

		// Print HELLO from the given string "AHCELWLXO"

		String str = "AHCECLWLXO";

		String[] split = str.split("");

		for (int i = 1; i < split.length; i = i + 2) {
			System.out.print(split[i]);
		}

	}

}

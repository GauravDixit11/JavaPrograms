public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ab = "madam"; // String literals
		String bc = "";

		for (int i = ab.length() - 1; i >= 0; i--) {
			bc = bc + ab.charAt(i);
		}
		System.out.println(bc);

		if (ab.equals(bc)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		// Reverse String using String Buffer Class
		// String Builder is more efficient but not thread safe
		// both are used on String manipulation , as String are immutable in nature

		StringBuffer sb = new StringBuffer("Gaurav");
		System.out.println(sb.reverse());
	}

}

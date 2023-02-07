
public class ReverseStringWithFirstLastConstant {

	public static void main(String[] args) {

		String str = "Hello World"; // Output - Hlleo Wlrod
		String[] arr = str.split("\\s");

		for (int i = 0; i < arr.length - 1; i++) {

			String newStr = reverseString(arr[i]) + reverseString(arr[i + 1]);
			System.out.println(newStr);
		}

	}

	static String reverseString(String str) {
		int i = 1;
		int j = str.length() - 2;
		char[] ch = str.toCharArray();

		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		str = new String(ch);
		return str;

	}
}

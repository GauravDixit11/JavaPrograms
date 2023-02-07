
public class CompareSpecialCharString {

	public static void main(String[] args) {
		
		String str = "\"ABCD\"";
		String str1 = "A@B$C^D&";
		
		String s = str1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
		String s1 = "\"" + s + "\"";
		System.out.println(s1);
		
		System.out.println(s1.equalsIgnoreCase(str));
		
		//String = dream - MAke first letter upper case
		
		String string = "dream";
		string = string.substring(0,1).toUpperCase()+string.substring(1).toLowerCase();
		System.out.println(string);
	}

}

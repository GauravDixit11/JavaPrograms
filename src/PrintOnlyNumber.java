
public class PrintOnlyNumber {

	public static void main(String[] args) {
		
		String str = "hegdg218vdh";
		
		char[] arr = str.toCharArray();
		
		for(Character ch : arr) {
			if(ch.isDigit(ch.charValue())) {
				System.out.print(ch);
			}
		}

	}

}

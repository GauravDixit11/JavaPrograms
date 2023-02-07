
public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		
		String a = "Good";
		String b = "Morning";
		
		a = a + b;
		b = a.substring(0,a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println("After swap a value : " +a);
		System.out.println("After swap b value : " +b);
		

	}

}

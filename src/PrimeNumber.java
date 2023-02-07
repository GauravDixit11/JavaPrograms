
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 4 ;
		boolean flag = false ;
		
		for(int j=2;j<=val/2;j++) {
			if(val%j==0) {
				flag = true;
				break;
			}
			
		}
		if(flag)
			System.out.println("NOt Prime");
		else
			System.out.println("Prime Number");
	}

}


public class TwoMAxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 5, 34, 78, 2, 45, 1, 99, 23, 100 };

		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		
		for(int n:num) {
			if(max1<n) {
				max3=max2;
				max2=max1;
				max1=n;
			}
			else if(max2<n) {
			
				max2=max1;
				max2=n;
			}
			else if(max3<n) {
				max3=n;
			}
		}
		System.out.println("First Max Number:"+max1);
		System.out.println("Second Max Number:"+max2);
		System.out.println("Third Max Number:"+max3);

	}

}


public class FibonacciSeries {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8,13

		int a = 0;
		int b = 1;
		int sum = 0;
		
		int i = 1;
		while(i<7) {
			sum = a+b ;
			a=b;
			b=sum;
			
			System.out.println(sum);
			
			i++;
		}

	}

}


public class ArrayMaxNumber {

	public static void main(String[] args) {
		int arr[] = {3,4,5,6,2,1,7,8,9};
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) 
				max=arr[i];
			
			
		}
		System.out.println(max);

	}

}

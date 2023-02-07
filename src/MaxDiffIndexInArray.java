
public class MaxDiffIndexInArray {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 9, 13, 18 }; // 3,4,4,5 //Output - 5

		int diff = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] > diff) {
				diff = arr[i + 1] - arr[i];
			}
		}
		System.out.println(diff);
	}

}

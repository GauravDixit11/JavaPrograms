
public class ArraySortWithZero {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 3, 0, 0, 5 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				arr[count++] = arr[i];

		}

		while (count < arr.length)
			arr[count++] = 0;

		// Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

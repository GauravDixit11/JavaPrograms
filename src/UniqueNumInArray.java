import java.util.ArrayList;

public class UniqueNumInArray {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 3, 6, 7, 4, 3, 4, 7 };

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			if (!al.contains(arr[i])) {
				al.add(arr[i]);
				k++;

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						k++;
					}
				}
				if (k == 1)
					System.out.println(arr[i] + " is a unique number");
			}
		}
	}

}

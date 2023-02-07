package pyramid;

public class NumberPyramidMultiply {

	public static void main(String[] args) {

		int k = 3;
		int s = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = i; j < i * 2; j++) {

				System.out.print(k * s);
				System.out.print("\t");
				s++;
			}
			System.out.println("");

		}

	}

}

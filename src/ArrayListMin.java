import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMin {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(6);
		list.add(1);

		Iterator<Integer> it = list.iterator();
		if (it.hasNext()) {
			int Min = list.get(0);

			for (int i = 0; i < list.size(); i++) {
				if (Min < list.get(i)) {
					it.next();
				} else {
					Min = list.get(i);
				}
			}

			System.out.println(Min);
		}

	}

}

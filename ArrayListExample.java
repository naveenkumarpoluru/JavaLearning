package day8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();

		//ArrayList al = new ArrayList();
		al.add("Aravinda");
		al.add("Avi");
		al.add("Jay");
		al.add("Ankush");
		al.add("Poonam");
		al.add("Pradyumna");
		al.add("Abhi");
		al.add(24545);

		System.out.println("Total Number : " + al.size());
		System.out.println("Values : " + al.get(3));

		Iterator<Object> itr = al.iterator();

		while (itr.hasNext()) {
			Object object = itr.next();
			System.out.println("Values : " + object);
		}

		// int obj = al.size();
		// for (int i = 0; i < obj; i++) {
		// System.out.println(al.get(i));
		// }
	}

}

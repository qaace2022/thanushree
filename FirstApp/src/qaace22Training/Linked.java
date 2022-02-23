package qaace22Training;
import java.util.*;
public class Linked {

	public static void main(String[] args) {
		LinkedList<String> month = new LinkedList<String>();
		month.add("December");
		month.add("January");
		month.add(null);
		month.addLast("March");
		month.addFirst("November");
		month.add(2, "August");
		System.out.println(month);
		System.out.println("Element at index 3 is : " + month.get(3));
		month.set(1, "July");
		System.out.println(month);
		for (String list : month)
			System.out.print(list + " ");
		month.remove("January");
		System.out.println(month);
		month.remove(3);
		System.out.println(month);
		month.removeFirst();
		System.out.println(month);
		month.removeLast();
		System.out.println(month);



	}

}

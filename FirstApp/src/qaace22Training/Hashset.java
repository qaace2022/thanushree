package qaace22Training;
import java.util.*;
public class Hashset 
{public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	System.out.println("Is the set empty: "+set.isEmpty());
	set.add("grapes");
	set.add("Jackfruit");
	set.add("orange");
	set.add("apple");
	set.add("gauva");
	set.add("chicko");
	set.add("greenapple");
	set.add(null);
	System.out.println(set);
	System.out.println(set.contains("August"));
	System.out.println("The size of the set is: " + set.size());
	for(String list:set) 
		System.out.println(list);
	set.remove("lemon");
	System.out.println("HashSet after removing elements: " + set);
	}
}



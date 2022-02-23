package qaace22Training;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	@SuppressWarnings({ "rawtypes", "unlikely-arg-type" })
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"December");
		map.put(2,"January");
		map.put(3,"August");
		map.put(4,"November");
		map.put(5,"May");
		map.put(3,"August");
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("August"));
		System.out.println(map.containsValue(4));
		System.out.println(map.get("November"));
		for(Map.Entry m : map.entrySet()){ 
			System.out.println(m.getKey()+" "+m.getValue());}
		map.remove("August");
		System.out.println(map);
		System.out.println(map.size());



	}

}

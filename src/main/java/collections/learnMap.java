package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class learnMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map1 = new TreeMap<>();
		Map<String, Integer> map2 = new LinkedHashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("Four", 4);

//	for(Map.Entry<String,Integer> e: map.entrySet()) {
//		System.out.println(e.getKey()+"->"+e.getValue());
//	}

		map.forEach((k, v) -> {
			System.out.print(k + " : ");
			System.out.println(v);
		});
		

		System.out.println(map.containsKey("one"));
		System.out.println(map.containsValue(4));
		
		map.remove("one");
	}
}

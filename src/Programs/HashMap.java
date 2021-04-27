package Programs;

import java.util.LinkedHashMap;

public class HashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(30, "Sara");
		map.put(40, "Hendry");
		map.put(20, "Ganesh");
		map.put(50, "Francy");
		
		System.out.println(map);
		
		map.forEach((Key,Value) -> System.out.println("The maplist are : " +Key+ " " +Value));
		
		

	}

}

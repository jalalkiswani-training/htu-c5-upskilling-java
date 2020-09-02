package edu.htu.upskilling.java.lectureb13;

import java.util.HashMap;
import java.util.Set;

public class Collections6 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap();
		map.put(103, "Ata");//Key + Value
		map.put(105, "Essa");
		map.put(205, "Jamal");
		
		String value= map.get("205");
		
		Set<Integer> keys= map.keySet();
		for (Integer key: keys) {
			System.out.println(key+" : "+map.get(key));
		}
		
		
//		System.out.println(value);
	}
}

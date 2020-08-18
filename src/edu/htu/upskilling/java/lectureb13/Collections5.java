package edu.htu.upskilling.java.lectureb13;

import java.util.HashMap;
import java.util.Set;

public class Collections5 {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(new Integer(103), "Ata");//Key + Value
		map.put(new Integer(105), "Essa");
		map.put(new Integer(205), "Jamal");
		
		String value1= (String) map.get("205");
		
		Set keys= map.keySet();
		for (Object key: keys) {
			Object value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
//		System.out.println(value);
	}
}

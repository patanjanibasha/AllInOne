package com.jani.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		 HashMap<Integer, String> hm = new HashMap<Integer, String>();

	        hm.put(101, "A");
	        hm.put(102, "B");
	        hm.put(null, "C");
	        hm.put(103, "D");
	        hm.put(104, "B");
	        hm.put(null, "C");
	        hm.put(null, "C");
	        hm.put(106, null);
	        hm.put(107,null);
	        hm.put(null, null);

	        for (Map.Entry<Integer, String> m : hm.entrySet()) 
	        {
	            System.out.println(m.getKey() + " - " + m.getValue());
	        }
	}

}

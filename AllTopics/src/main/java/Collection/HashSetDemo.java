package Collection;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class HashSetDemo {

	public static void main(String[] args) {
		 Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

	        hm.put(101, "D");
	        hm.put(102, "B");
	        
	        hm.put(103, "D");
	        hm.put(104, "B");
	       
	     //   Collections.sort(hm);
	        for (Map.Entry<Integer, String> m : hm.entrySet()) 
	        {
	            System.out.println(m.getKey() + " - " + m.getValue());
	        }

	}

}

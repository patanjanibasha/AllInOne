package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2Wraperclasses {

	public static void main(String[] args) {
		List li = new ArrayList<String>();
		li.add("D");
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("A");
		li.add("B");
		li.add("C");
		
	//	li.remove(0); // remove using index
	//	li.get(2); // access using index
		
		System.out.println("size : "+li.size());
		System.out.println("before sorting...");
		for(Object s:li)
		{
			System.out.println(s);
		}
		
		Collections.sort(li);
		
		System.out.println("after sorting...");
		for(Object s:li)
		{
			System.out.println(s);
		}

	}

}

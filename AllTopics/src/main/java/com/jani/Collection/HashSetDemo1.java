package com.jani.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {

		Set hs = new HashSet<String>();
		//	li.add(1);  error
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("A");
		hs.add("B");
		hs.add("C");
			
			System.out.println("size : "+hs.size());
			System.out.println("before sorting...");
			for(Object s:hs)
			{
				System.out.println(s);
			}
			
	//	Collections.so
			
			System.out.println("after sorting...");
			for(Object s:hs)
			{
				System.out.println(s);
			}

	}

}

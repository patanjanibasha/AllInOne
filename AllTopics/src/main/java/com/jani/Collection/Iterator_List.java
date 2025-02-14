package com.jani.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_List {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		  
        list.add("chiru"); 
        list.add("Balayya"); 
        list.add("venkatesh"); 
  
        Iterator ite = list.iterator(); 
  
        System.out.println("List elements : "); 
  
        while (ite.hasNext()) 
            System.out.println(ite.next() + " "); 
  
        System.out.println(); 

	}

}

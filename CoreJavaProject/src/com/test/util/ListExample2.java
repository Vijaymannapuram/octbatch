package com.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Jhon");
		list.add("Tim");
		list.add("Steve");
		list.add("Vipul");
		list.add("Cathy");
		list.add("ken");
		list.add("Jhon");
		System.out.println(" Before Remove " + list);
		
		List<String> searchlist = new ArrayList<String>();
		searchlist.add("ken");
		searchlist.add("Vipul");
		searchlist.add("Steve");
		
		
		if(list.contains("ken")){
			System.out.println("Element Found");
		}else{
			System.out.println("Not Found");
		}

	if(list.containsAll(searchlist)){
		System.out.println("Elements Found");
	}else{
		System.out.println("Not Found");
	}
	list.remove("Steve");
	System.out.println(" After Remove " + list);
     Collections.sort(list);
	System.out.println("After sort" + list);
	}
	

}

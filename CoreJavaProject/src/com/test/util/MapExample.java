package com.test.util;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> dataMap = new Hashtable<String,String>();
		
		dataMap.put("101", "Rama");
		dataMap.put("108", "Steve");
		dataMap.put("106", "Jhon");
		dataMap.put("101", "Ken");
		
		String name = dataMap.get("108");
		
		System.out.println(" Name "+ name);
		
		Set<String> keySet = dataMap.keySet();
		
		System.out.println(" keys ");
		for(String key : keySet){
			System.out.println(dataMap.get(key));
		}
		System.out.println(" Values ");
		Collection<String> ValueList = dataMap.values();
		
		System.out.println(ValueList);
		
		System.out.println(dataMap);
		

	}

}

package com.examples.util;

//import java.util.Arrayset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Jhon");
		set.add("Tim");
		set.add("Steve");
		set.add("Vipul");
		set.add("Cathy");
		set.add("ken");
		set.add("Jhon");
		
		set.add("Jhon");
		set.add("Tim");
		set.add("Steve");
		set.add("Vipul");
		set.add("Cathy");
		set.add("ken");
		set.add("Jhon");
		
		System.out.println(" Size " + set.size());
		
		System.out.println(" List " + set);
		
		
	}
}

		
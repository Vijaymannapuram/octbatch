package com.test.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//import java.util.vector;

//import com.test.oops.Employee;

public class ListExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Jhon");
		list.add("Tim");
		list.add("Steve");
		list.add("Vipul");
		list.add("Cathy");
		list.add("ken");
		list.add("Jhon");
		
		System.out.println(" Size " + list.size());
		
		System.out.println(" List " + list);
		//Legacy
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
			System.out.println("===============================");
			//Enhanced For Loop
			
			for(String str:list){
				System.out.println(str.toUpperCase());
				/*if(str.equals("Tim")){
					list.add("Tim1"); 
					}*/
				System.out.println(" Befor Delete Size : " + list.size());
					
			Iterator<String> iterator = list.iterator();
			
			/*for(;iterator.hasNext();){
				
				String str = iterator.next();
					if(str.equals("Jhon")){
						iterator.remove();
						}
			 
			}*/
					while (iterator.hasNext()){
						String str1 = iterator.next();
						if(str1.equals("Tim")){
							iterator.remove();
							}
				}
					System.out.println(" After Delete Size " + list.size());
					
					ListIterator<String> listIterator = list.listIterator();
					while(listIterator.hasNext()){
						String str1 = listIterator.next();
						if(str1.equals("Jhon")){
							listIterator.remove();
							}else{
								listIterator.add("New Element");
							}
				}
					
					while(listIterator.hasPrevious()){
						String str1 = listIterator.previous();
						if(str1.equals("Jhon")){
							listIterator.remove();
							}else{
								listIterator.add("New Element");
							}
				}
					System.out.println(" After Delete Size " + list.size());
			}
			
		}
		

	}

}

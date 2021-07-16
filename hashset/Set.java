package com.pratian.hashset;

import java.util.*;
public class Set {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		set1.add("Apple");
		set1.add("Samsung");
		set1.add("LG");
		set1.add("Nokia");
		set1.add("MicroMax");
		
		set2.add("Sony");
		set2.add("Apple");
		set2.add("Spice");
		set2.add("Nokia");
		set2.add("HTC");
		
		//Intersection of 2 sets
//		set1.retainAll(set2);
//		System.out.println("Intersection:"+" "+ set1);
		
		//union of s=2 sets
//		System.out.println("Union:"+" "+set1.addAll(set2));
//		System.out.println(set1);
		
		//Difference in set1
//		set1.removeAll(set2);
//		System.out.println(set1);
		
		//Difference in set2
		set2.removeAll(set1);
		System.out.println(set2);
		
	}

}

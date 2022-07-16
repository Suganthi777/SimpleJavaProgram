package org.javaprogram;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int a[]= {10,20,30,10,20,40};
		Set<Integer> s=new TreeSet<>();
		for (Integer int1 : a) {
			s.add(int1);
			
			
		}
		System.out.println(s);
		
		
		
		
		
	}

}

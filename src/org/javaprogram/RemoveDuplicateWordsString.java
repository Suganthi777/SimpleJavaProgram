package org.javaprogram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsString {

	public static void main(String[] args) {

		String str = "has have had has";
		String res = " ";
		Set<String> s = new LinkedHashSet<>();
		String[] sp = str.split(" ");
		for (String s1 : sp) {
			s.add(s1);

		}
		System.out.println(s);

	}

}

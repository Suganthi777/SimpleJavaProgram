package org.javaprogram;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateLetterFromString {
	public static void main(String[] args) {

		String s = "Welcome";
		String space = " ";
		Set<Character> str = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			str.add(ch);

		}

		for (Character character : str) {
			space = space + character;

		}
		System.out.println(space);

	}
}
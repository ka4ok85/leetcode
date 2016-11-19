package com.github.ka4ok85.leetcode;

public class ReverseString {

	public String reverseString(String string) {
		char[] charsArray = string.toCharArray();
		char buffer;

		for (int i = 0; i < charsArray.length / 2; i++) {
			buffer = charsArray[i];
			charsArray[i] = charsArray[charsArray.length - i - 1];
			charsArray[charsArray.length - i - 1] = buffer;
		}
		
		return new String(charsArray);
    }
}

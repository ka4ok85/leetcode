package com.github.ka4ok85.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	private static int FIZZ_INT_VALUE = 3;
	private static int BUZZ_INT_VALUE = 5;

	private static String FIZZ_WORD = "Fizz";
	private static String BUZZ_WORD = "Buzz";
	
	public List<String> fizzBuzz(int number) {
        ArrayList<String> result = new ArrayList<String>(number);
        for (int i = 1; i <= number; i++) {
        	result.add(getFizzBuzzValue(i));
		}
        
        return result;
    }
	
	public String getFizzBuzzValue (int number) {
		if ((number % FIZZ_INT_VALUE) == 0 && (number % BUZZ_INT_VALUE) == 0) {
			return FIZZ_WORD + BUZZ_WORD;
		} else if ((number % FIZZ_INT_VALUE) == 0) {
			return FIZZ_WORD;
		} else  if ((number % BUZZ_INT_VALUE) == 0) {
			return BUZZ_WORD;
		} else {
			return Integer.toString(number);
		}		
	}
}

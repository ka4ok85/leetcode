package com.github.ka4ok85.leetcode;

import java.util.*;

public class Run {

	public static void main(String[] args) {
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> test = groupAnagrams(input);
		
		for (List<String> list : test) {
			for (String element : list) {
				System.out.print(element + ", ");
			}

			System.out.println();
		}

	}
	
    public static List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> result = new ArrayList<List<String>>();
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	char[] charsArray;
    	String sortedKey;
    	for (String element : strs) {
    		charsArray = element.toCharArray();
    		Arrays.sort(charsArray);
    		sortedKey = new String(charsArray);
    		
    		if (map.containsKey(sortedKey)) {
    			List<String> existedValues = map.get(sortedKey);
    			existedValues.add(element);
    			map.put(sortedKey, existedValues);
    		} else {
    			List<String> newValues = new ArrayList<String>();
    			newValues.add(element);
    			map.put(sortedKey, newValues);
    		}
		}
    	
    	Set<String> mapKeys = map.keySet();
    	for (String key : mapKeys) {
			result.add(map.get(key));
		}
    	
    	return result;
    }
}

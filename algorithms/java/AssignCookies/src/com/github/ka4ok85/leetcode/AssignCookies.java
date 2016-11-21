package com.github.ka4ok85.leetcode;

import java.util.Arrays;

public class AssignCookies {
	    public int findContentChildren(int[] g, int[] s) {
	    	if (g.length == 0 || s.length == 0) {
	    		return 0;
	    	}

	    	int content = 0;
	    	int position = 0;
	    	Arrays.sort(g);
	    	Arrays.sort(s);
	    	for (int i = 0; i < g.length && i < s.length; i++) {
	    		for (int j = position; j < s.length; j++) {
					if (g[i] <= s[j]) {
						content++;
						position = j + 1;
						break;
					}
	    		}
			}
	    	
	    	return content;
	    }
}

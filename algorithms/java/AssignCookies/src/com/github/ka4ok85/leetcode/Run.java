package com.github.ka4ok85.leetcode;

public class Run {

	public static void main(String[] args) {
		AssignCookies assignCookies = new AssignCookies();
		int[] g = {10,9,8,7};
		int[] s = {5,6,7,8};
		int result = assignCookies.findContentChildren(g, s);
		System.out.println(result);
	}

}

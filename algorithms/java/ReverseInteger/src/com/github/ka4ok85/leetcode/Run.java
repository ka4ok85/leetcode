package com.github.ka4ok85.leetcode;

public class Run {

	public static void main(String[] args) {
		System.out.println(reverseInteger(214748364));
	}

	public static int reverseInteger(int x) {
		int output = 0;
		int power = 10;
		int overflow = 429496729;
		int test = 0;
		while (x != 0) {

			output = output * power + (x % power);
/*
			if (test*power + (x % power) != output) {
				return 0;
			}
*/
			if (output / power != test) {
				return 0;
			}
System.out.println("output " + output);
			x = x / power;

			
			test = output;

System.out.println("input " + x);
System.out.println("_____");
		}

		return output;
	}
}
// 2147483648
//964632435
// 2147483656
//-2143847412
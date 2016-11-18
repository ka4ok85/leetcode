package com.github.ka4ok85.leetcode;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testCorrectNumberOfElementsReturned() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		for (int i = 0; i <= 10; i++) {
			assertEquals(fizzBuzz.fizzBuzz(i).size(), i);
		}

	}

	@Test
	public void testCorrectFizzValueReturned() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(6);
		values.add(9);
		values.add(12);
		values.add(18);
		
		for (Integer i : values) {
			assertEquals(fizzBuzz.getFizzBuzzValue(i), "Fizz");
		}
	}
	
	@Test
	public void testCorrectBuzzValueReturned() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(10);
		values.add(20);
		values.add(25);
		values.add(35);
		
		for (Integer i : values) {
			assertEquals(fizzBuzz.getFizzBuzzValue(i), "Buzz");
		}
	}
	
	@Test
	public void testCorrectFizzBuzzValueReturned() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(15);
		values.add(30);
		values.add(45);
		values.add(60);
		values.add(75);
		
		for (Integer i : values) {
			assertEquals(fizzBuzz.getFizzBuzzValue(i), "FizzBuzz");
		}
	}
	
	@Test
	public void testCorrectNumberValueReturned() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(4);
		values.add(7);
		values.add(8);
		
		for (Integer i : values) {
			assertEquals(fizzBuzz.getFizzBuzzValue(i), Integer.toString(i));
		}
	}
}

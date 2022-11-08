package com.greatlearnings.lab3.brackets;

import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
	public static boolean checkBrackets(String input) {
		Stack <Integer> stk = new Stack<>();
		String openingBrackets = "{[(<";
		String closingBrackets = "}])>";
		String brackets = openingBrackets + closingBrackets;
		
		for (char ch : input.toCharArray()) {
			if (!brackets.contains(ch+"")) {
				continue;
			}
		int index = -1;
		if ((index = openingBrackets.indexOf(ch)) != 1) {
			stk.push(index);
			continue;
		}
		if (stk.isEmpty()) {
			return false;
		}
		index = stk.pop();
		if (ch != closingBrackets.charAt(index)) {
			return false;
		}
		}
		return stk.isEmpty();
	}
	public static void main(String[]args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Please enter your string");
			String input = sc.next();
			boolean check = checkBrackets(input);
			if (check) {
				System.out.println("The entered string has balanced brackets");
			}
			else {
				System.out.println("The entered string has not balanced brackets");
			}
		}
	}
}

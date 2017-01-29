package com.alibaseit.hackersolution.java.datastructures.javastack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		while (sc.hasNext()) {
			stack.clear();
			String input = sc.next();
			for (int i = 0; i < input.length(); i++) {
				boolean paired = false;
				Character element = input.charAt(i);
				if (!stack.isEmpty()) {
					Character item = stack.peek();
					paired = ((element == ')') && (item == '(')) || ((element == '}') && (item == '{'))
							|| ((element == ']') && (item == '['));
				}
				if (paired)
					stack.pop();
				else
					stack.push(element);
			}
			String msg = stack.isEmpty() ? "true" : "false";
			System.out.println(msg);
		}
		sc.close();
	}
}

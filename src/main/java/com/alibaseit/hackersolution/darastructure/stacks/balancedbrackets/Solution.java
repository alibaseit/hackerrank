package com.alibaseit.hackersolution.darastructure.stacks.balancedbrackets;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int t = scanner.nextInt();
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < t; i++) {
				stack.clear();
				String s = scanner.next();
				boolean balanced = true;
				int k = 0;
				while ((k < s.length()) && (balanced)) {
					char c = s.charAt(k);
					if (isOpeningBracket(c)) {
						stack.push(c);
					} else if (isClosingBracket(c)) {
						if (!stack.isEmpty())
							balanced = isBalanced(c, stack.pop());
						else
							balanced = false;
					}
					k = k + 1;
				}
				if ((stack.isEmpty()) && (balanced))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}

	private static boolean isBalanced(char close, char open) {
		return ((open == '(') && (close == ')') || (open == '{') && (close == '}') || (open == '[') && (close == ']'));
	}

	private static boolean isClosingBracket(char ch) {
		return "}])".indexOf(ch) > -1;
	}

	private static boolean isOpeningBracket(char ch) {
		return "{[(".indexOf(ch) > -1;
	}
}

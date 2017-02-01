package com.alibaseit.hackersolution.java.datastructures.javastack.simpletexteditor;

import java.util.Scanner;
import java.util.Stack;

/**
 * Solution for problem {@link} https://www.hackerrank.com/challenges/simple-text-editor
 * @author alido
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Operation> stack = new Stack<>();
		StringBuilder text = new StringBuilder();
		int n = scanner.nextInt();
		while (n-- > 0) {
			int opNo = scanner.nextInt();
			switch (opNo) {
			case 1: //append
				String line = scanner.next();
				text.append(line);
				stack.push(new Operation(1, line));
				break;
			case 2: //delete
				int charNum = scanner.nextInt();
				int from = text.length() - charNum;
				int to = text.length();
				String deletedStr = text.substring(from ,to);
				text.delete(from, to);
				stack.push(new Operation(2, deletedStr));
				break;
			case 3: //print k th char
				int index = scanner.nextInt();
				System.out.println(text.charAt(index -1));
				break;
			case 4: //undo
				Operation prevOperation = stack.pop();
				if (prevOperation.opNo == 1)  { //append
				   int len = prevOperation.string.length();
				   text.delete(text.length() - len, text.length());
				} else if (prevOperation.opNo == 2) {
					text.append(prevOperation.string);
				}
				break;
			default:
				break;
			}
		}
		scanner.close();
	}

}

class Operation {
	int opNo;
	String string;
	public Operation(int opNo, String string) {
		this.opNo = opNo;
		this.string = string;
	}
}

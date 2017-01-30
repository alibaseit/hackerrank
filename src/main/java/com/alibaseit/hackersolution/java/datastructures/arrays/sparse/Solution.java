package com.alibaseit.hackersolution.java.datastructures.arrays.sparse;

import static java.lang.System.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(in)) {
			int n = scanner.nextInt();
			List<String> line = new ArrayList<>();
			while (n-- > 0) {
				line.add(scanner.next());
			}
		    int ql = scanner.nextInt();
			for (int i = 0; i < ql; i++) {
				String cs = scanner.next();
				int counter = (int) line.stream().filter(l -> l.equals(cs)).count();
				System.out.println(counter);
			}
		}
	}
}

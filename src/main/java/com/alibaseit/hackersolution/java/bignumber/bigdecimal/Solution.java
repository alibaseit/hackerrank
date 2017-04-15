package com.alibaseit.hackersolution.java.bignumber.bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// Input
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String[] s = new String[n + 2];
			for (int i = 0; i < n; i++) {
				s[i] = sc.next();
			}

			Arrays.sort(s, 0, n, Collections.reverseOrder((a1, a2) -> {
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }));
			for (int i = 0; i < n; i++) {
				System.out.println(s[i]);
			}
		}
	}
}
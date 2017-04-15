package com.alibaseit.hackersolution.java.strings.birthdaycandle;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }
        OptionalInt max = Arrays.stream(height).max();
        long candleCnt = Arrays.stream(height).filter(num -> max.getAsInt() == num).count();
        System.out.println(candleCnt);
    }
}

package com.alibaseit.hackersolution.java.algorithms.implementation.gradingstudents;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static void solve(int[] grades) {
        Arrays.stream(grades)
                .map(grade -> {
                    if (grade >= 38) {
                        int remainder = (grade % 5);
                        int addition = Math.abs(5 - remainder);
                        if (addition < 3)
                            return grade + addition;
                    }
                    return grade;
                }).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        solve(grades);
    }
}

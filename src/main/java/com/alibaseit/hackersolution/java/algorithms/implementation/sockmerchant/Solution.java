package com.alibaseit.hackersolution.java.algorithms.implementation.sockmerchant;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        Stream<Integer> stream = Arrays.stream(c).boxed();
        Map<Integer, Long> map = stream
                .collect(groupingBy(i -> i, Collectors.counting() ) );

        Integer sum = map.values().stream().filter(p -> p > 1).map(p -> p / 2)
                .collect(summingInt(p -> p.intValue()));
        System.out.println(sum);
    }
}

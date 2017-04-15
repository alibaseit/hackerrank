package com.alibaseit.hackersolution.java.strings.palindrome;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String word = scanner.nextLine();
            StringBuilder reversed = new StringBuilder(word).reverse();
            System.out.println(reversed.toString().equals(word)? "Yes" : "No");
        }
    }
}

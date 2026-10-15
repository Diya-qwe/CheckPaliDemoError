package com.example;

public class StringPalindrome {


    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
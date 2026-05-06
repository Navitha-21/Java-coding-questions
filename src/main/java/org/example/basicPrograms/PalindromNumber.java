package org.example.basicPrograms;

public class PalindromNumber {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

// Palindrom using string.
//        String str = "ABCBA";
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev += str.charAt(i);
//        }
//        if (str.equals(rev))
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not Palindrome");
    }
}

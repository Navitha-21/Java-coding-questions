package org.example.stringPrograms;

public class StringContainsNumbers {
    public static void main(String[] args) {
        String str = "12345";
        boolean isDigits = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isDigits = false;
                break;
            }
        }
        if (isDigits)
            System.out.println("Contains only digits");
        else
            System.out.println("Contains non-digit characters");
    }
}

package org.example.arrayPrograms;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // missing 3
        int n = 5;

        int sum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        System.out.println("Missing: " + (sum - arrSum));
    }
}

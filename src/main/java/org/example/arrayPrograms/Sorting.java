package org.example.arrayPrograms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};

        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

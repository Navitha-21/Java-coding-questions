package org.example.basicPrograms;

public class Swap2Numbers {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a=" + a + ", b=" + b);

//  without temp
//        int a = 5, b = 10;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println("a=" + a + ", b=" + b);
    }
}

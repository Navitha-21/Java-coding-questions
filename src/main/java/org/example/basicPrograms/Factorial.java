package org.example.basicPrograms;

public class Factorial {
    public static void main(String[] args) {
        int n = 5, fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }

//    Recursion type
//static int fact(int n) {
//    if (n == 0)
//        return 1;
//    return n * fact(n - 1);
//}
//
//    public static void main(String[] args) {
//        System.out.println(fact(5));
//    }
}

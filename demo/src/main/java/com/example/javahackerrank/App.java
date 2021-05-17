package com.example.javahackerrank;

public class App {
    public static void main(String[] args) {
        int count = 0;
        int i = 20;
        int j = 23;
        int k = 6;

        for (int r = i; r <= j; r++) {
            String a = Integer.toString(r);
            String reversedA = new StringBuilder(a).reverse().toString();
            double d = Double.parseDouble(reversedA);

            double result = (Math.abs(r - d) / k);
            if (result % 1 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

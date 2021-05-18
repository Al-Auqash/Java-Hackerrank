package com.example.javahackerrank;

import java.util.Arrays;
import java.util.ArrayList;

public class PickingNumber {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        // int[] arr = new int[6];
        // arr[0] = 6;
        // arr[1] = 1;
        // arr[2] = 1;
        // arr[3] = 3;
        // arr[4] = 3;
        // arr[5] = 4;

        // Arrays.sort(arr);
        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            int index = arr.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        // return result;
    }
}

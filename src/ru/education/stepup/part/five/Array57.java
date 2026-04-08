package ru.education.stepup.part.five;

import java.util.Arrays;

public class Array57 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
    public static void reverse(int[] arr){
        int[] arr1 = new int[arr.length];
        int j = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            arr1[j--]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}

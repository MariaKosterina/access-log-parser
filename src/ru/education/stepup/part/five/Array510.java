package ru.education.stepup.part.five;

import java.util.Arrays;

public class Array510 {
    public static void main(String[] args) {
        int[] arr={1,2,-3,4,-2,2,-5};
        System.out.println(Arrays.toString(deleteNegative(arr)));
    }
    public static int[] deleteNegative(int[] arr){
        int countInsert=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0) countInsert++;
        }
        int[] arr1 = new int[countInsert];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0) arr1[j++]=arr[i];
        }
        return arr1;
    }
}

package ru.education.stepup.part.five;

import java.util.Arrays;

public class Array511 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(add(arr,9,3)));
    }
    public static int[] add(int[] arr, int x, int pos){
        int[] arr1 = new int[arr.length+1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==pos) {arr1[j]=x; j++;}
            arr1[j++]=arr[i];
        }
        return arr1;
    }
}

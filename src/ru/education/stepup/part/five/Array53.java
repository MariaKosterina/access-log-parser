package ru.education.stepup.part.five;

public class Array53 {
    public static void main(String[] args) {
        int[] arr={1,-2,-7,4,2,2,5};
        System.out.println(maxAbs(arr));
    }
    public static int maxAbs(int[] arr){
        int max=Math.abs(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i])>Math.abs(max)) max=arr[i];
        }
        return max;
    }
}

package ru.education.stepup.part.five;

public class Array52 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,2,5};
        System.out.println(findFirst(arr, 2));
    }
    public static int findFirst(int[] arr, int x){
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i]==x) return i;
        }
        return -1;
    }
}

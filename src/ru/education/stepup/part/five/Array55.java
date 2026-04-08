package ru.education.stepup.part.five;

public class Array55 {
    public static void main(String[] args) {
        int[] arr={1,-2,-7,4,-7,-2,1};
        System.out.println(palindrom(arr));
    }
    public static boolean palindrom(int[] arr){
        int[] arr1 = new int[arr.length];
        int j = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
                arr1[j--]=arr[i];
        }
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]==arr1[j++])&&(i==arr.length-1)) return true;
        }
        return false;
    }
}

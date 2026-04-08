import java.util.Arrays;

public class Array58 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2 ={7,8,9};
        System.out.println(Arrays.toString(reverse(arr1, arr2)));
    }
    public static int[] reverse(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        return arr3;
    }
}

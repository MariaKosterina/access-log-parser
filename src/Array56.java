import java.util.Arrays;

public class Array56 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
    public static void reverse(int[] arr){
        /*int[] arr1 = new int[arr.length];
        int j = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            arr1[j--]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));*/
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}

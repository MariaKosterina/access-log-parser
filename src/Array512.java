import java.util.Arrays;

public class Array512 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ins={7,8,9};
        System.out.println(Arrays.toString(add(arr,ins,3)));
    }
    public static int[] add(int[] arr, int[] ins, int pos){
        int[] arr1 = new int[arr.length+ ins.length];
        int j=0;
        for (int i = 0; i < pos; i++) {
            arr1[i]=arr[i];
        }
        for (int i = pos; i < pos+ins.length; i++) {
            arr1[i]=ins[j++];
        }
        for (int i = pos+ins.length; i < arr1.length; i++) {
            arr1[i]=arr[i-pos];
        }
        return arr1;
    }
}

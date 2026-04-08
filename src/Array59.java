import java.util.Arrays;

public class Array59 {
    public static void main(String[] args) {
        int[] arr={1,2,3,8,2,2,9};
        System.out.println(Arrays.toString(findAll(arr, 2)));
    }
    public static int[] findAll(int[] arr, int x){
        int countInsert=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) countInsert++;
        }
        int[] arr1 = new int[countInsert];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) arr1[j++]=i;
        }
        return arr1;
    }
}

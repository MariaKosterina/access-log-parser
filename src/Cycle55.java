public class Cycle55 {
    public static void main(String[] args) {
        System.out.println(numLen(1234567890));
    }
    public static int numLen(long x){
        int count=0;
        while (x>0){
            count++;
            x/=10;
        }
        return count;
    }
}

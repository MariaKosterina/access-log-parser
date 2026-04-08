public class Cycle54 {
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
    public static int pow(int x, int y){
        int res = 1;
        for (int i=1; i<=y; i++){
            res*=x;
        }
        return res;
    }
}

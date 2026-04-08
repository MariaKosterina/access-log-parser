public class Cycle58 {
    public static void main(String[] args) {
        leftTriangle(2);
        System.out.println("----------");
        leftTriangle(3);
        System.out.println("----------");
        leftTriangle(4);
    }
    public static void leftTriangle(int x){
        for (int i = x; i > 0; i--) {
            for (int j = x; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

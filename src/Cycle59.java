public class Cycle59 {
    public static void main(String[] args) {
        leftTriangle(2);
        System.out.println("----------");
        leftTriangle(3);
        System.out.println("----------");
        leftTriangle(4);
    }
    public static void leftTriangle(int x){
        for (int i = x; i > 0; i--) {
            System.out.print(" ".repeat(i-1));
            for (int j = x; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

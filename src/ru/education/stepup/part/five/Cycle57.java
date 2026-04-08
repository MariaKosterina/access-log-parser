package ru.education.stepup.part.five;

public class Cycle57 {
    public static void main(String[] args) {
        square(2);
        System.out.println("----------");
        square(3);
        System.out.println("----------");
        square(4);
    }
    public static void square(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

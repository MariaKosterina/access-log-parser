package ru.education.stepup.part.five;

public class Cycle52 {
    public static void main(String[] args) {
        System.out.println(reverseListNums(5));
        System.out.println(reverseListNums(10));
        System.out.println(reverseListNums(15));
    }
    public static String reverseListNums(int x){
        String res ="";
        for (int i=x; i>=0; i--){
            res=res + " " +i;
        }
        return res;
    }
}

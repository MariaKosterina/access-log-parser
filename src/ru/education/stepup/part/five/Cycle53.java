package ru.education.stepup.part.five;

public class Cycle53 {
    public static void main(String[] args) {
    System.out.println(chet(9));
    System.out.println(chet(10));
    System.out.println(chet(15));
}
    public static String chet(int x){
        String res ="";
        for (int i=0; i<=x; i=i+2){
            res=res + " " +i;
        }
        return res;
    }
}

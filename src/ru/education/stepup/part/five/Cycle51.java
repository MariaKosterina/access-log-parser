package ru.education.stepup.part.five;

public class Cycle51 {
    public static void main(String[] args) {
        System.out.println(listNums(5));
        System.out.println(listNums(10));
        System.out.println(listNums(15));
    }
    public static String listNums(int x){
        String res ="";
        for (int i=0; i<=x; i++){
            res=res + " " +i;
        }
        return res;
    }
}

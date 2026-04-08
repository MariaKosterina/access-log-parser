package ru.education.stepup.part.five;

public class Cycle56 {
    public static void main(String[] args) {
        System.out.println(equalNum(11111));
        System.out.println(equalNum(11211));
    }
    public static boolean equalNum(int x){
                int i=0;
        i=x%10;
        while (x>0){
            if (i==(x%10)) x/=10;
            else return false;
        }
        return true;
    }
}

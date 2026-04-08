package ru.education.stepup.part.five;

import java.util.Random;

public class Cycle510 {
    public static void main(String[] args) {
        guessGame();
    }
    public static void guessGame() {
        Random random = new Random();
        int randomNum = random.nextInt(10);
        int x;
        int count=0;
        System.out.println("What number am I thinking (0 to 9)? :");
        do { count++;
            java.util.Scanner sc = new java.util.Scanner(System.in);
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
                System.out.println("Guessed it in "+ count + " tries!");
            }
        }
        while (x!=randomNum);
    }
}

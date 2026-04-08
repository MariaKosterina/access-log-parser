package ru.education.stepup.part.ten;

import java.util.*;

public class Collections103 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7};
        System.out.println("Исходный вид массива чисел: " + Arrays.toString(intArray));
        reverseInt(intArray);
        System.out.println("----------------");
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("Исходный вид списка чисел: " + intList);
        reverseList(intList);
    }
    public static void reverseInt(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
        System.out.println("Вид массива чисел после перестановки: " + Arrays.toString(intArray));
    }

    public static void reverseList(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
        System.out.println("Вид списка чисел после перестановки: " + intList);
    }
}
/*
//Альтернатива (в одну строку)
//Можно вообще не писать цикл:
Collections.reverse(intList);
*/
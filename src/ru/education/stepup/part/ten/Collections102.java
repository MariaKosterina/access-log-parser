package ru.education.stepup.part.ten;

import java.util.*;

public class Collections102 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(6,3,4,6,7,3,2));
        System.out.println("Исходный вид списка чисел: " + intList);
        bubbleSortList(intList);
        System.out.println("----------------");
        int[] intArray = {6,3,4,6,7,3,2};
        System.out.println("Исходный вид массива чисел: " + Arrays.toString(intArray));
        bubbleSortInt(intArray);
    }
    public static void bubbleSortList(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Вид списка чисел после сортировки \"пузырьком\": " + intList);
    }

    public static void bubbleSortInt(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Вид массива чисел после сортировки \"пузырьком\": " + Arrays.toString(intArray));
    }
}

package ru.education.stepup.part.ten;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream102 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        printList(list);
    }
    public static void printList(ArrayList<Integer> list) {
        list.forEach(i -> System.out.println(i));
    }
}

package ru.education.stepup.part.ten;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream101 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Hello,", "World!", "My", "name", "is", "Maria!");
        System.out.println(getStringFromStream(stringStream));
    }
    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }
}

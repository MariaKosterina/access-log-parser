package ru.education.stepup.part.ten;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StatisticsCollections101 {
    // Храним адреса страниц с кодом 200
    private static Set<String> existingPages = new HashSet<>();

    // Храним количество встреч каждой операционной системы
    private static Map<String, Integer> osCounts = new HashMap<>();

    /**
     * Добавляет запись о посещении страницы пользователем
     *
     * @param url        адрес страницы
     * @param httpCode   HTTP код ответа (например, 200)
     * @param os         операционная система пользователя
     */
    public static void addEntry(String url, int httpCode, String os) {
        // Если страница существует, добавляем в HashSet
        if (httpCode == 200) {
            existingPages.add(url);
        }

        // Подсчёт операционных систем
        osCounts.put(os, osCounts.getOrDefault(os, 0) + 1);
    }

    /**
     * Возвращает список всех существующих страниц
     */
    public static Set<String> getExistingPages() {
        return new HashSet<>(existingPages); // Возвращаем копию, чтобы не дать менять внутренний Set
    }

    /**
     * Возвращает статистику операционных систем в виде долей (от 0 до 1)
     */
    public static Map<String, Double> getOsStatistics() {
        Map<String, Double> osStats = new HashMap<>();
        int total = osCounts.values().stream().mapToInt(Integer::intValue).sum();

        for (Map.Entry<String, Integer> entry : osCounts.entrySet()) {
            double fraction = (double) entry.getValue() / total;
            osStats.put(entry.getKey(), fraction);
        }

        return osStats;
    }

    // Для проверки
    public static void main(String[] args) {
        addEntry("/index.html", 200, "Windows");
        addEntry("/about.html", 200, "Linux");
        addEntry("/contact.html", 404, "Windows");
        addEntry("/index.html", 200, "Windows");
        addEntry("/blog.html", 200, "MacOS");

        System.out.println("Существующие страницы: " + getExistingPages());
        System.out.println("Статистика ОС: " + getOsStatistics());
    }
}

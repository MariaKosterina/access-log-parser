package ru.education.stepup.part.ten;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StatisticsCollections102 {
    // Существующие страницы (код 200)
    private static Set<String> existingPages = new HashSet<>();

    // Несуществующие страницы (код 404)
    private static Set<String> nonExistingPages = new HashSet<>();

    // Статистика ОС пользователей
    private static Map<String, Integer> osCounts = new HashMap<>();

    // Статистика браузеров пользователей
    private static Map<String, Integer> browserCounts = new HashMap<>();

    /**
     * Добавляет запись о посещении страницы пользователем
     *
     * @param url       адрес страницы
     * @param httpCode  HTTP код ответа (например, 200 или 404)
     * @param os        операционная система пользователя
     * @param browser   браузер пользователя
     */
    public static void addEntry(String url, int httpCode, String os, String browser) {
        // 1. Существующие страницы
        if (httpCode == 200) {
            existingPages.add(url);
        }

        // 2. Несуществующие страницы
        if (httpCode == 404) {
            nonExistingPages.add(url);
        }

        // 3. Статистика ОС
        osCounts.put(os, osCounts.getOrDefault(os, 0) + 1);

        // 4. Статистика браузеров
        browserCounts.put(browser, browserCounts.getOrDefault(browser, 0) + 1);
    }

    /**
     * Возвращает все существующие страницы
     */
    public static Set<String> getExistingPages() {
        return new HashSet<>(existingPages);
    }

    /**
     * Возвращает все несуществующие страницы
     */
    public static Set<String> getNonExistingPages() {
        return new HashSet<>(nonExistingPages);
    }

    /**
     * Возвращает статистику ОС пользователей в долях от 0 до 1
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

    /**
     * Возвращает статистику браузеров пользователей в долях от 0 до 1
     */
    public static Map<String, Double> getBrowserStatistics() {
        Map<String, Double> browserStats = new HashMap<>();
        int total = browserCounts.values().stream().mapToInt(Integer::intValue).sum();

        for (Map.Entry<String, Integer> entry : browserCounts.entrySet()) {
            double fraction = (double) entry.getValue() / total;
            browserStats.put(entry.getKey(), fraction);
        }
        return browserStats;
    }

    // Для тестирования
    public static void main(String[] args) {
        addEntry("/index.html", 200, "Windows", "Chrome");
        addEntry("/about.html", 200, "Linux", "Firefox");
        addEntry("/contact.html", 404, "Windows", "Chrome");
        addEntry("/index.html", 200, "Windows", "Chrome");
        addEntry("/blog.html", 200, "MacOS", "Safari");
        addEntry("/error.html", 404, "Linux", "Firefox");

        System.out.println("Существующие страницы: " + getExistingPages());
        System.out.println("Несуществующие страницы: " + getNonExistingPages());
        System.out.println("Статистика ОС: " + getOsStatistics());
        System.out.println("Статистика браузеров: " + getBrowserStatistics());
    }
}

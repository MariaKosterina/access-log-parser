package ru.education.stepup.part.ten;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StatisticsStream101 {
    // Счётчики страниц
    private static Set<String> existingPages = new HashSet<>();
    private static Set<String> nonExistingPages = new HashSet<>();

    // Статистика ОС и браузеров
    private static Map<String, Integer> osCounts = new HashMap<>();
    private static Map<String, Integer> browserCounts = new HashMap<>();

    // Для расчёта посещаемости
    private static int totalVisits = 0; // все посещения (не бот)
    private static int totalErrors = 0; // все ошибки (4xx и 5xx)
    private static Set<String> uniqueUserIps = new HashSet<>(); // уникальные IP пользователей (не бот)
    private static double hoursLogged = 1.0; // период логов в часах, можно задать через сеттер

    /**
     * Добавление записи лога
     *
     * @param url        адрес страницы
     * @param httpCode   код ответа
     * @param os         операционная система
     * @param browser    браузер
     * @param userAgent  user-agent
     * @param ipAddress  ip-адрес пользователя
     */
    public static void addEntry(String url, int httpCode, String os, String browser, String userAgent, String ipAddress) {
        boolean isBot = userAgent.toLowerCase().contains("bot");

        // 1. Страницы
        if (httpCode == 200) existingPages.add(url);
        if (httpCode == 404) nonExistingPages.add(url);

        // 2. ОС и браузеры
        osCounts.put(os, osCounts.getOrDefault(os, 0) + 1);
        browserCounts.put(browser, browserCounts.getOrDefault(browser, 0) + 1);

        // 3. Подсчёт посещений только для неботов
        if (!isBot) {
            totalVisits++;
            uniqueUserIps.add(ipAddress);
        }

        // 4. Подсчёт ошибок
        if (httpCode >= 400 && httpCode < 600) {
            totalErrors++;
        }
    }

    // Setter для количества часов логов
    public static void setHoursLogged(double hours) {
        hoursLogged = hours;
    }

    /** Возвращает среднее количество посещений сайта за час (только реальные пользователи) */
    public static double getAverageVisitsPerHour() {
        return totalVisits / hoursLogged;
    }

    /** Возвращает среднее количество ошибок за час */
    public static double getAverageErrorsPerHour() {
        return totalErrors / hoursLogged;
    }

    /** Возвращает среднее количество посещений на одного уникального пользователя (не бота) */
    public static double getAverageVisitsPerUser() {
        if (uniqueUserIps.isEmpty()) return 0;
        return (double) totalVisits / uniqueUserIps.size();
    }

    /** Дополнительные методы для проверки */
    public static Set<String> getExistingPages() {
        return new HashSet<>(existingPages);
    }

    public static Set<String> getNonExistingPages() {
        return new HashSet<>(nonExistingPages);
    }

    public static Map<String, Double> getOsStatistics() {
        Map<String, Double> stats = new HashMap<>();
        int total = osCounts.values().stream().mapToInt(Integer::intValue).sum();
        for (Map.Entry<String, Integer> entry : osCounts.entrySet()) {
            stats.put(entry.getKey(), (double) entry.getValue() / total);
        }
        return stats;
    }

    public static Map<String, Double> getBrowserStatistics() {
        Map<String, Double> stats = new HashMap<>();
        int total = browserCounts.values().stream().mapToInt(Integer::intValue).sum();
        for (Map.Entry<String, Integer> entry : browserCounts.entrySet()) {
            stats.put(entry.getKey(), (double) entry.getValue() / total);
        }
        return stats;
    }

    // Пример использования
    public static void main(String[] args) {
        setHoursLogged(2.0); // считаем, что лог велся 2 часа

        addEntry("/index.html", 200, "Windows", "Chrome", "Mozilla/5.0", "192.168.1.1");
        addEntry("/about.html", 200, "Linux", "Firefox", "Mozilla/5.0", "192.168.1.2");
        addEntry("/contact.html", 404, "Windows", "Chrome", "Googlebot/2.1", "192.168.1.3"); // бот
        addEntry("/index.html", 500, "Windows", "Chrome", "Mozilla/5.0", "192.168.1.1");
        addEntry("/blog.html", 200, "MacOS", "Safari", "Mozilla/5.0", "192.168.1.4");

        System.out.println("Среднее посещений в час: " + getAverageVisitsPerHour());
        System.out.println("Среднее ошибок в час: " + getAverageErrorsPerHour());
        System.out.println("Среднее посещений на пользователя: " + getAverageVisitsPerUser());
    }
}

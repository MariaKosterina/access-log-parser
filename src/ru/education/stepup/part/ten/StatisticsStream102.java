package ru.education.stepup.part.ten;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StatisticsStream102 {
    // Параметры предыдущих задач
    private static Set<String> existingPages = new HashSet<>();
    private static Set<String> nonExistingPages = new HashSet<>();
    private static Map<String, Integer> osCounts = new HashMap<>();
    private static Map<String, Integer> browserCounts = new HashMap<>();
    private static int totalVisits = 0;
    private static int totalErrors = 0;
    private static Set<String> uniqueUserIps = new HashSet<>();
    private static double hoursLogged = 1.0;

    // Новые поля
    private static Map<Integer, Integer> visitsPerSecond = new HashMap<>();
    private static Set<String> refererDomains = new HashSet<>();
    private static Map<String, Integer> visitsPerUser = new HashMap<>(); // IP -> количество посещений (не боты)

    /**
     * Добавление записи лога
     *
     * @param url        адрес страницы
     * @param httpCode   код ответа
     * @param os         операционная система
     * @param browser    браузер
     * @param userAgent  user-agent
     * @param ipAddress  IP пользователя
     * @param referer    referer URL
     * @param second     номер секунды, когда был запрос (0..59)
     */
    public static void addEntry(String url, int httpCode, String os, String browser, String userAgent,
                                String ipAddress, String referer, int second) {
        boolean isBot = userAgent.toLowerCase().contains("bot");

        // Страницы
        if (httpCode == 200) existingPages.add(url);
        if (httpCode == 404) nonExistingPages.add(url);

        // ОС и браузеры
        osCounts.put(os, osCounts.getOrDefault(os, 0) + 1);
        browserCounts.put(browser, browserCounts.getOrDefault(browser, 0) + 1);

        // Уникальные IP и количество посещений
        if (!isBot) {
            totalVisits++;
            uniqueUserIps.add(ipAddress);
            visitsPerUser.put(ipAddress, visitsPerUser.getOrDefault(ipAddress, 0) + 1);

            // Пиковая посещаемость по секундам
            visitsPerSecond.put(second, visitsPerSecond.getOrDefault(second, 0) + 1);
        }

        // Подсчёт ошибок
        if (httpCode >= 400 && httpCode < 600) totalErrors++;

        // Сбор доменов referer
        if (referer != null && !referer.isEmpty()) {
            try {
                URL refererUrl = new URL(referer);
                refererDomains.add(refererUrl.getHost());
            } catch (MalformedURLException e) {
                // Игнорируем некорректный URL
            }
        }
    }

    /** Setter для количества часов логов */
    public static void setHoursLogged(double hours) {
        hoursLogged = hours;
    }

    /** Пиковая посещаемость сайта в секунду */
    public static int getPeakVisitsPerSecond() {
        return visitsPerSecond.values().stream().max(Integer::compareTo).orElse(0);
    }

    /** Список доменов referer’ов */
    public static Set<String> getRefererDomains() {
        return new HashSet<>(refererDomains);
    }

    /** Максимальное количество посещений одним пользователем (не бот) */
    public static int getMaxVisitsPerUser() {
        return visitsPerUser.values().stream().max(Integer::compareTo).orElse(0);
    }

    /** Среднее посещений за час */
    public static double getAverageVisitsPerHour() {
        return totalVisits / hoursLogged;
    }

    /** Среднее ошибок за час */
    public static double getAverageErrorsPerHour() {
        return totalErrors / hoursLogged;
    }

    /** Среднее посещений на пользователя */
    public static double getAverageVisitsPerUser() {
        if (uniqueUserIps.isEmpty()) return 0;
        return (double) totalVisits / uniqueUserIps.size();
    }

    /** Проверка */
    public static void main(String[] args) {
        setHoursLogged(1.0);

        addEntry("/index.html", 200, "Windows", "Chrome", "Mozilla/5.0", "192.168.1.1", "https://google.com/search", 10);
        addEntry("/about.html", 200, "Linux", "Firefox", "Mozilla/5.0", "192.168.1.2", "https://nova-news.ru/page", 12);
        addEntry("/contact.html", 404, "Windows", "Chrome", "Googlebot/2.1", "192.168.1.3", "https://site.com", 15); // бот
        addEntry("/index.html", 200, "Windows", "Chrome", "Mozilla/5.0", "192.168.1.1", "", 10);
        addEntry("/blog.html", 200, "MacOS", "Safari", "Mozilla/5.0", "192.168.1.4", "https://pikabu.ru", 20);

        System.out.println("Пиковая посещаемость в секунду: " + getPeakVisitsPerSecond());
        System.out.println("Домен referer’ов: " + getRefererDomains());
        System.out.println("Максимальное посещение одним пользователем: " + getMaxVisitsPerUser());
    }
}

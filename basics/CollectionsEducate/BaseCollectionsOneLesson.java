package org.example;
import java.util.*;

public class CollectionLesson{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Вишня");
        fruits.add("Арбуз");
        fruits.add("Яблоко");
        fruits.add(2,"");
        System.out.println(fruits);

        List<String> fruits2 = new LinkedList<>();
        fruits2.add("Яблоко");
        fruits2.add("Вишня");
        fruits2.add("Арбуз");
        fruits2.add("Яблоко");
        System.out.println(fruits2);

        Set<String> fruits3 = new HashSet<>();
        fruits3.add("Яблоко");
        fruits3.add("Вишня");
        fruits3.add("Арбуз");
        fruits3.add("Яблоко");
        System.out.println(fruits3);

        Set<String> fruits4 = new LinkedHashSet<>();
        fruits4.add("Яблоко");
        fruits4.add("Вишня");
        fruits4.add("Арбуз");
        fruits4.add("Яблоко");
        System.out.println(fruits4);

        Set<String> fruits5 = new TreeSet<>();
        fruits5.add("Яблоко");
        fruits5.add("Вишня");
        fruits5.add("Арбуз");
        fruits5.add("Яблоко");
        System.out.println(fruits5);

        Map<String, Integer> fruits6 = new HashMap<>();
        fruits6.put("Яблоко", 6);
        fruits6.put("Ананас", 6);
        fruits6.put("Вишня", 5);
        fruits6.put("Яблоко", 4);
        fruits6.putIfAbsent("Яблоко", 9);
        System.out.println(fruits6);

        Map<String, Integer> fruits7 = new LinkedHashMap<>();
        fruits7.put("Яблоко", 6);
        fruits7.put("Ананас", 6);
        fruits7.put("Вишня", 5);
        fruits7.put("Яблоко", 4);
        fruits7.putIfAbsent("Яблоко", 9);
        System.out.println(fruits7);

        Map<String, Integer> fruits8 = new TreeMap<>();
        fruits8.put("Яблоко", 6);
        fruits8.put("Ананас", 6);
        fruits8.put("Вишня", 5);
        fruits8.put("Яблоко", 4);
        fruits8.putIfAbsent("Яблоко", 9);
        System.out.println(fruits8);
    }
}

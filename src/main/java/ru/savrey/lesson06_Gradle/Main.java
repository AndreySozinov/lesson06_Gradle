package ru.savrey.lesson06_Gradle;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Утилитарный класс Lists из Google Guava
        List<Integer> someList = Lists.newArrayList(1, 2, 3, 4, 5);
        System.out.println(someList);

        String some_string = "Hello Lists";
        List<Character> char_list = Lists.charactersOf(some_string);
        System.out.println(some_string);
        System.out.println(char_list);

        List<List<Character>> two_elements_list = Lists.partition(char_list, 2);
        System.out.println(two_elements_list);
        System.out.println();

        // Утилитарный класс Sets из Google Guava
        Integer[] num1 = {2, 4, 8, 6, 4, 9, 6};
        Integer[] num2 = {3, 7, 2, 15, 12, 6, 15};
        Set<Integer> first = new HashSet<>(List.of(num1));
        Set<Integer> second = new HashSet<>(List.of(num2));
        Set<Integer> union = Sets.union(first, second);
        Set<Integer> intersection = Sets.intersection(first, second);
        Set<Integer> difference = Sets.union(Sets.difference(first, second), Sets.difference(second, first));
        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);
    }
}

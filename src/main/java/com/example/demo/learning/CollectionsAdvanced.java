package com.example.demo.learning;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class CollectionsAdvanced {
    public static void main(String[] args) {
        CollectionsAdvanced c = new CollectionsAdvanced();
        List<Integer> li = Arrays.asList(19, 2, 31, 7, 14);

    }

    public int findSomeOfDigits(int n) {
        if(n <10)
            return n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return findSomeOfDigits(sum);
    }

    public String getFirstNonRepeatingCharacter(String str)
    {
        char c = '\0';
        String s = str.toLowerCase();
        for(Character ch:s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                c = ch;
                break;
            }
        }
        return String.valueOf(c);
    }

    public boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Given a string, create a map with key as character and value as its count
    public void stringMap(String str) {
        Stream<Character> stream = str.chars().mapToObj(c -> (char) c);

        List<Employee> el = Employee.getEmployees();
        Map<String, List<Employee>> map = el.stream()
                .collect(groupingBy(Employee::getDepartment));
    }
}

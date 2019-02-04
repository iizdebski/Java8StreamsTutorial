package com.izdebski;

import java.io.IOException;
import java.util.Arrays;

public class ArraySortFilterPrint {

    public static void main(String[] args) throws IOException {

        // 5. Stream from Array, sort, filter and print

        String[] names = {"Ali", "Ankit", "Kushal", "Brent", "Sakira", "Amanda", "Hans", "Shivika"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
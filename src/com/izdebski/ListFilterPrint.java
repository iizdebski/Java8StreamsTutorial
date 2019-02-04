package com.izdebski;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ListFilterPrint {

    public static void main(String[] args) throws IOException {

        // 7. Stream from List, filter and print

        List<String> people = Arrays.asList("Ali", "Ankit", "Brent", "Sakira", "Amanda", "Hans");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }
}
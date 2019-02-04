package com.izdebski;

import java.io.IOException;
import java.util.stream.Stream;

public class StreamsFindFirst {


    public static void main(String[] args) throws IOException {

        // 4. Stream.of, sorted and findFirst

        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
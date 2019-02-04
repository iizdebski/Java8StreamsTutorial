package com.izdebski;

import java.io.IOException;
import java.util.stream.IntStream;

public class IntegerStream {

    public static void main(String[] args) throws IOException {

        // 1.Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::println);
        System.out.println();
    }
}
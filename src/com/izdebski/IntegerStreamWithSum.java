package com.izdebski;

import java.io.IOException;
import java.util.stream.IntStream;

public class IntegerStreamWithSum {

    public static void main(String[] args) throws IOException {

        // 3. Integer Stream with sum

        System.out.println(
                IntStream
                .range(1, 5)
                .sum());
        System.out.println();
    }
}
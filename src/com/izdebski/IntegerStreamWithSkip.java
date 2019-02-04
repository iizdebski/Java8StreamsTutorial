package com.izdebski;

import java.io.IOException;
import java.util.stream.IntStream;

public class IntegerStreamWithSkip {

    public static void main(String[] args) throws IOException {

        // 2. Integer Stream with skip

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
    }
}
package com.izdebski;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileSortFilterPrint {

    public static void main(String[] args) throws IOException {

        // 8. Stream rows from text file, sort, filter, and print

        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\user\\IdeaProjects\\Java8StreamsTutorial\\src\\resources\\bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();
    }
}
package com.izdebski;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRowsTextFileSaveToList {

    public static void main(String[] args) throws IOException {

        // 9. Stream rows from text file and save to List

        List<String>bands2 = Files.lines(Paths.get("C:\\Users\\user\\IdeaProjects\\Java8StreamsTutorial\\src\\resources\\bands.txt"))
                .filter(x ->x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));
    }
}
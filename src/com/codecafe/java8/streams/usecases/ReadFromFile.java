package com.codecafe.java8.streams.usecases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Read a file and count the occurrence of a word in it
public class ReadFromFile {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Abhinav\\git\\java-8\\src\\com\\codecafe\\java8\\streams\\usecases\\hosts";

        String searchWord = "localhost";

        System.out.printf("occurrence of word [%s] = %d", searchWord, Files.lines(Paths.get(path))
                                                                          .filter(line -> line.contains(searchWord))
                                                                          .count());
    }

}

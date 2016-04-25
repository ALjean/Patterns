package com.jean.multithreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileManeger {


    public void getFiles(){

        try {
            Path path = Paths.get("/home/stas/testData");
            Stream<Path> store = Files.list(path);

            System.out.println("---");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

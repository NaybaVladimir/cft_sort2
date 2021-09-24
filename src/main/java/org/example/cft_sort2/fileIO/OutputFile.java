package org.example.cft_sort2.fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class OutputFile {
    private String uri;

    public OutputFile(String uri) {
        this.uri = uri;
    }

    //Запись в файл
    public void outFile(List<String> list) {
        try (PrintWriter write = new PrintWriter(uri)) {
            for (String el : list)
                write.println(el);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

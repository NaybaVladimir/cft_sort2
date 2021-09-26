package org.example.cft_sort2.fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputFile {
    private String uri;

    public OutputFile(String uri) {
        this.uri = uri;
    }

    //Запись в файл
    public void outFile(String[] str) {
        try (PrintWriter write = new PrintWriter(uri)) {
            for (String el : str)
                write.println(el);
        } catch (FileNotFoundException e) {
            System.out.println("Файл вывода не найден или нарушен порядок ввода пармматеров. Путь к файоу вывода: " + uri);
        }

    }
}

package org.example.cft_sort2.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFile {
    private String uri;

    public InputFile(String uri) {
        this.uri = uri;
    }

    //Считывание из файла
    public List<String> inString() {
        if (!new File(uri).isFile()) {
            System.out.println(uri + " - В этом параметре допущена ошибка");
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(uri))) {
            while (bufferedReader.ready())
                list.add(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка при считывании файла - " + uri);
        }
        return list;
    }
}

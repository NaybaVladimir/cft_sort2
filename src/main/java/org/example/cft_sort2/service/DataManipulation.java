package org.example.cft_sort2.service;

import org.example.cft_sort2.fileIO.InputFile;

import java.util.ArrayList;
import java.util.List;

public class DataManipulation {

    //Собирает данные из всех файлов в одну коллекцию
    public List<String> listI(List<String> uri) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < uri.size(); i++)
            for (String el : new InputFile(uri.get(i)).inString())
                list.add(el);
        return list;
    }
}

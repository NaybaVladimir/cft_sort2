package org.example.cft_sort2.service;

public class DataSort {
    public String[] stringSort(String[] array) {
        String temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] != null && array[j - 1] != null && (array[j].compareTo(array[j - 1]) < 0)) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array;
    }

    public String[] intSort(String[] array) {
        return array;
    }

    public String[] invertCollection(String[] array) {

        return array;
    }
}

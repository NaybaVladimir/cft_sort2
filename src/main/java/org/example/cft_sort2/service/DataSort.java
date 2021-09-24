package org.example.cft_sort2.service;

import java.util.Arrays;

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

    public String[] intSort(String[] arrayStr) {
        int[] array = Arrays.stream(arrayStr).mapToInt(Integer::parseInt).toArray();
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }

        return Arrays.toString(array).replace("[", "").replace("]", "").replaceAll(" ", "").split(",");
    }

    public String[] invertCollection(String[] array) {
        String[] strRet = new String[];
        return array;
    }
}

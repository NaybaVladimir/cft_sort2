package org.example.cft_sort2;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.example.cft_sort2.service.DataManipulation;
import org.example.cft_sort2.service.DataSort;

import java.util.Arrays;
import java.util.List;

/*
1. режим сортировки (-a или -d), необязательный, по умолчанию сортируем по возрастанию;
2. тип данных (-s или -i), обязательный;
3. имя выходного файла, обязательное;
4. остальные параметры – имена входных файлов, не менее одного.
Примеры запуска из командной строки для Windows:
sort-it.exe -i -a out.txt in.txt (для целых чисел по возрастанию)
sort-it.exe -s out.txt in1.txt in2.txt in3.txt (для строк по возрастанию)
sort-it.exe -d -s out.txt in1.txt in2.txt (для строк по убыванию)*/
public class Main {

    @Parameter(names = "-a")
    private boolean ascendingSort = true; //default
    @Parameter(names = "-d")
    private boolean descendingSort;
    @Parameter(names = "-s")
    private boolean string;
    @Parameter(names = "-i")
    private boolean integer;
    @Parameter
    List<String> listFile;

    public static void main(String[] args) {
        if (args.length >= 3)
            mainMenu(args);
        else
            System.out.println("Слишком мало входных парметров. Проверьте: " + Arrays.toString(args));


    }

    public static void mainMenu(String[] args) {
        DataManipulation dataManipulation = new DataManipulation();
        DataSort dataSort=new DataSort();
        Main main = new Main();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(args);


        List<String> list = dataManipulation.listI(main.listFile);
        String[] array = dataSort.stringSort(list.toArray(new String[list.size()]));
        System.out.println(list);
        System.out.println(Arrays.toString(array));
    }

}

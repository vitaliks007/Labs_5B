package com.mireaHW.lab19_20;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        //Text here
        Generator generator = new Generator();
        generator.preGenerate();


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> listSorted;


        for (int i = 0; i < n; i++) { // Я сдаюсь - я не знаю, как это оптимизировать
            list.add(generator.getRandom());
        }
        list.add("E000AB01");
        System.out.println(list);

        listSorted = list;
        Collections.sort(listSorted);
        HashSet hashSet = new HashSet(list);
        TreeSet treeSet = new TreeSet<String>(list);

        System.out.println();

        long m = System.nanoTime();
        System.out.printf("Поиск перебором: номер %s, поиск занял %dнс",
                (list.contains(str) ? "найден" : "не найден"), (System.nanoTime() - m));
        System.out.println();

        m = System.nanoTime();
        System.out.printf("Бинарный поиск: номер %s, поиск занял %dнс",
                (Collections.binarySearch(listSorted, str) >= 0 ? "найден" : "не найден"), (System.nanoTime() - m));
        System.out.println();

        m = System.nanoTime();
        System.out.printf("Поиск в HashSet: номер %s, поиск занял %dнс",
                (hashSet.contains(str) ? "найден" : "не найден"), (System.nanoTime() - m));
        System.out.println();

        m = System.nanoTime();
        System.out.printf("Поиск в TreeSet: номер %s, поиск занял %dнс",
                (treeSet.contains(str) ? "найден" : "не найден"), (System.nanoTime() - m));
        System.out.println();
    }
}
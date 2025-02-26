package com.example.project.Insertion_Sort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // int[] arrA = {2, 5, 11, 29, 22, 34, 36, 45, 45, 77, 91, 96};
        // InsertionSort.selectionSort(arrA);
        // System.out.println(Arrays.toString(arrA));
        // System.out.println();
        // int[] arrB = {2, 5, 11, 29, 22, 34, 36, 45, 45, 77, 91, 96};
        // InsertionSort.insertionSort(arrB);
        // System.out.println(Arrays.toString(arrB));

        ArrayList<String> selectionWords = new ArrayList<>();
        ArrayList<String> insertionWords = new ArrayList<>();
        InsertionSort.loadWordsInto(selectionWords);
        InsertionSort.loadWordsInto(insertionWords);

        InsertionSort.selectionSortWordList(selectionWords);
        InsertionSort.insertionSortWordList(insertionWords);
    }
}

package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int iterations = 0;
        for (int i = 1; i < elements.length; i++) {
            int currentNumber = elements[i];
            int currentIndex = i;
            while (currentIndex > 0 && currentNumber < elements[currentIndex - 1]) {
                iterations++;
                elements[currentIndex] = elements[currentIndex - 1];
                currentIndex--;
            }
            elements[currentIndex] = currentNumber;
        }
        System.out.println("INSERTION SORT: Iterated " + iterations + " times");
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        int iterations = 0;
        for (int i = 0; i < elements.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < elements.length; j++) {
                iterations++;
                if (elements[j] < elements[minIdx]) {
                    minIdx = j;
                }
            }
            int min = elements[minIdx];
            elements[minIdx] = elements[i];
            elements[i] = min;
        }
        System.out.println("SELECTION SORT: Iterated " + iterations + " times");
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int iterations = 0;
        for (int i = 1; i < words.size(); i++) {
            String currentWord = words.get(i);
            int currentIndex = i;
            while (currentIndex > 0 && currentWord.compareTo(words.get(currentIndex - 1)) < 0) {
                iterations++;
                words.set(currentIndex, words.get(currentIndex - 1));
                currentIndex--;
            }
            words.set(currentIndex, currentWord);
        }
        System.out.println("INSERTION SORT: Iterated " + iterations + " times");
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        int iterations = 0;
        for (int i = 0; i < words.size(); i++) {
            int minIdx = i;
            for (int j = i + 1; j < words.size(); j++) {
                iterations++;
                if (words.get(j).compareTo(words.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }
            String min = words.get(minIdx);
            words.set(minIdx, words.get(i));
            words.set(i, min);
        }
        System.out.println("SELECTION SORT: Iterated " + iterations + " times");
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}
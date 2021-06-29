package com.Alevel;

public class InsertionSort {
    public String[] array;

    public InsertionSort(String... array) {
        this.array = array;
    }

    public int[] insertionSortASC(int[] array){
        int in, out;
        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in-1] >= temp){
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }
        return array;
    }

    public int[] insertionSortDESC(int[] array){
        int in, out;
        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] < temp) {
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }
        return array;
    }
}
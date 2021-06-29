package com.Alevel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arraySorted;
        StringArray stringArray = new StringArray("5", "1", "2", "3", "5", "9", "7", "0");
        stringArray.printArray(stringArray.myArr);

        int[] array = {5,1,2,3,5,9,7,0};
        InsertionSort sorts = new InsertionSort();
        arraySorted = sorts.insertionSortASC(array);
        System.out.println(Arrays.toString(arraySorted));

        arraySorted = sorts.insertionSortDESC(array);
        System.out.println(Arrays.toString(arraySorted));

        numberedArray(array);
    }

    static int[] numberedArray(int[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " : " + (i + 1) + " element; ");
        }
        return stringArray;
    }
}
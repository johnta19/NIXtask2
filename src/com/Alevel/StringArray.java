package com.Alevel;

import java.util.Arrays;

public class StringArray {
    public String[] myArr;
    public StringArray(String... myArr){
        this.myArr = myArr;
    }

    public void printArray(String[]k){
        System.out.println(Arrays.toString(k));
    }
}
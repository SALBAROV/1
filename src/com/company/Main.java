package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0;i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(array[0]+" "+array[49]+" "+array[99]);

        }
    }



    
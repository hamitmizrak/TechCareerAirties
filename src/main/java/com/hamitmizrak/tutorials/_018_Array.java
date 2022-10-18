package com.hamitmizrak.tutorials;

import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class _018_Array {

    public void arrayTutorials(String[] data, byte... data2) {
        /*int[] arrayData = new int[5];
        arrayData[0]=10;
        arrayData[1]=90;
        arrayData[2]=30;
        arrayData[3]=50;*/
        //System.out.println(arrayData[2]);
        int[] arrayData = {10, 90, 30, 50};
        Arrays.sort(arrayData);
        for (int i = 0; i < arrayData.length; i++) {
            System.out.print(arrayData[i] + " ");
        }
        System.out.println("\n*******************************");
        for (int temp : arrayData) {
            System.out.print(temp + " ");
        }
    }

    public static void arrayTutorials() {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        for (int i = 0; i <matrix.length ; i++) {//satır
            for (int k = 0; k <matrix[i].length ; k++) {//sutun
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*_018_Array array = new _018_Array();
        array.arrayTutorials();*/
        arrayTutorials();
    }


}

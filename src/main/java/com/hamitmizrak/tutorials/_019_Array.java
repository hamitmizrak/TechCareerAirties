package com.hamitmizrak.tutorials;

import java.util.Arrays;
import java.util.Random;

// Random , int[]
// 0-10 arasında 5 tane random sayı oluturup tek boyutlu diziye atayalım ?
// bu sayıların toplamı
// bu sayılar çift kaç tane ve toplamları ?
// metot yaparak ilerliyelim ?
public class _019_Array {

    public static void arrayExamp(){
        Random random=new Random();
        int[] dizi=new int[5];
        int sum=0, evensum=0,evenCounter=0;
        for (int i = 0; i <dizi.length ; i++) {
           int result=random.nextInt(10)+0;
            dizi[i]=result;
            if(dizi[i]%2==0){
                evenCounter++;
                evensum+=dizi[i];
            }
            sum+=dizi[i];
        }
        for (int temp:dizi ) {
            System.out.print(temp+" ");
        }
        System.out.println("\nGenel Toplam "+sum);
        System.out.println("Çift sayı adeti  "+evenCounter);
        System.out.println("Çift sayı toplamı  "+evensum);
    }

    public static void main(String[] args) {
        arrayExamp();
    }

}

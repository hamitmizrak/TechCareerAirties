package com.hamitmizrak.tutorials;

//Stream
/*
filter  => filtrelemek
forEach => döngü
map     => her bir elemana uğramak
distinct=> tekrar eden verileri göstermez.
sorted  => sıralama
limit   => limitleme
count   => sayma
*/

import java.util.ArrayList;
import java.util.List;

public class _024_StreamApi1 {

    //Array
    public static String[] strArray() {
        String[] arrayData = {"ankara", "malatya", "istanbul", "eskişehir", "sivas", "malatya", "elazığ", "malatya"};
        return arrayData;
    }

    //Collection
    public static List<String> collectionListData() {
        List<String> strList = new ArrayList<>();
        strList.add("ankara");
        strList.add("malatya");
        strList.add("istanbul");
        strList.add("eskişehir");
        strList.add("sivas");
        strList.add("malatya");
        strList.add("elazığ");
        strList.add("malatya");
        return strList;
    }

    //Array'ı => Liste çevir
    public static List<String> arrayToList() {
        return  List.of(strArray());
    }

    public static void streamForEachMethod(){
        //List<String> list= collectionListData();
        List<String> list= arrayToList();
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n*******************");
        //forEach
        /*System.out.println("\n*******************");
        list.stream().forEach(System.out::println);
        System.out.println("\n*******************");
        //method referances
        list.forEach(System.out::println);*/

        //forEach Lambda Expression
        list.forEach( (temp)->{
            System.out.print(temp.toUpperCase().substring(0,3)+" ");
        });
    }

    //PSVM
    public static void main(String[] args) {
        streamForEachMethod();
    }
}

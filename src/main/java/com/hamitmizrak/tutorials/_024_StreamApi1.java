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
    public static String[] strArray(){
        String[] arrayData={"ankara","malatya","istanbul","eskişehir","sivas","malatya","elazığ","malatya"};
        return arrayData;
    }

    //Collection
    public static List<String> collectionListData(){
        List<String> strList=new ArrayList<>();
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

    //PSVM
    public static void main(String[] args) {

    }
}

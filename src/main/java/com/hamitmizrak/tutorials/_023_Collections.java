package com.hamitmizrak.tutorials;

import java.util.*;

public class _023_Collections<T> {

    public static void main(String[] args) {

        Set<String> listem=new HashSet<>();
        listem.add("malatya");
        listem.add("kayseri");
        listem.add("ankara");
        listem.add("istanbul");

        //listem.remove(0);
        //listem.clear();
        //System.out.println(listem.size());
       // System.out.println(listem.get(listem.size()-1));

        //1
       /* for (int i = 0; i <listem.size() ; i++) {
            System.out.println(listem.get(i));
        }*/
        //2
       /* System.out.println("*******************");
        for (String i : listem) {
            System.out.println(i);
        }*/

        //3
        /*System.out.println("*******************");
        Iterator iterator=listem.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*******************");*/
        //4
        //listem.forEach(System.out::println);

        Map<String,Object> mapList=new HashMap<>();

        for (int i = 0; i <5 ; i++) {
            UUID uuid=UUID.randomUUID();
            mapList.put(uuid.toString(),"sehir "+i);
        }

        for(String temp : mapList.keySet()  ){
            System.out.println(temp+" "+mapList.get(temp));
        }

    }
}

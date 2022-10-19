package com.hamitmizrak.tutorials;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _025_Annotation implements Serializable {



    //Version 1
    @Deprecated
    public static String version1() {
        return "v1";
    }

    //Version 2
    @SuppressWarnings("yapacak bir şey yok ben ne dersem o ")
    public static String version2() {
        return "v2";
    }


    //PSVM
    public static void main(String[] args) {
        version1();
    }


}

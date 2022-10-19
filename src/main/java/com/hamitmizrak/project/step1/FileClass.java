package com.hamitmizrak.project.step1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileClass {
    //field
    private final String date=createdDate();

    //constructor
    public FileClass() throws BlogException {
        fileIoData();
    }

    private static void fileIoData() throws BlogException {
        File file=new File(FilePath.MY_PATH);
        try {
            if(file.createNewFile()){
                System.out.println(FilePath.MY_PATH+" oluşturuldu");
            }else{
                System.out.println("Böyle bir dosya bulunmaktadır.");
            }
        } catch (IOException e) {
            throw new BlogException(e.toString());
        }
    }


    //parametresiz constructor
    private String createdDate() {
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        return simpleDateFormat.format(new Date());
    }

    public static void main(String[] args) throws BlogException {
        FileClass fileClass=new FileClass();
    }
}

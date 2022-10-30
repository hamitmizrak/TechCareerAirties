package com.hamitmizrak.io;

import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.nio.file.Files.createFile;

//Absolute Path:sabittir
//Relative Path:dinamiktir

//@Log4j2
public class FileCommonExamples {

    //Path URL
    private static final String PATH = "C:\\io\\techcareer";

    private static File file;


    //constructor (form.txt defaultta oluşturulsun
    public FileCommonExamples() throws HamitMizrakException {
        String myFilePath=PATH.concat("\\form.txt");
        file=new File(myFilePath);
        try {
            if(file.createNewFile()){
                System.out.println(myFilePath+" oluşturuldu");
            }else{
                System.out.println(myFilePath+" Zaten  oluşturulmuş");
            }
        }catch (IOException ioException) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + ioException);
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + exception);
        }
    }

    //DATE
    private static String nowDate() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss", locale);
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        return str;
    }

    //userData
    private static String userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String data = klavye.nextLine();
        return "[" + nowDate() + "] " + data;
    }

    //CREATE(1)
    private static void fileCreateData() throws HamitMizrakException {
        System.out.println("Lütfen dosya ismini yazınız");
        Scanner klavye = new Scanner(System.in);
        String specialUserPath= klavye.nextLine().concat(".txt");
        String PATH = "C:\\io\\techcareer\\"+specialUserPath;
        file=new File(PATH);
        try {
            if(file.createNewFile()){
                System.out.println(specialUserPath+" oluşturuldu");
            }else{
                System.out.println(specialUserPath+" Zaten  oluşturulmuş");
            }
        }catch (IOException ioException) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + ioException);
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + exception);
        }
    }


    //All files(3)
    private static void allFiles(){
        //file=new File("C:\\io\\techcareer\\");
        //String baseFilePath=file.getParent();
        //System.out.println(baseFilePath);
        for(File temp: new File("C:\\io\\techcareer").listFiles()){
            System.out.println(temp.getName());
        }
    }

    //DELETE(2)
    private static void fileDeleteData() throws HamitMizrakException {
        allFiles();
        System.out.println("Silmek istediğiniz dosya ismini yazınız");
        Scanner klavye = new Scanner(System.in);
        String specialUserPath= klavye.nextLine().concat(".txt");

        File deleteFile=new File(PATH.concat("\\"+specialUserPath));
        try {
            if(deleteFile.exists()){
                deleteFile.delete();
                System.out.println("Dosyanız silindi");
            }else{
                System.out.println("Dosya Silinmedi");
            }
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + exception);
        }
    }

    // fileInformation(3)
    private static void fileInformation() {
        //
    }

    //Roles (4)
    private static void changeRoles(){
    }


    //WRİTER(6)
    private static void fileWriterData() throws HamitMizrakException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            String result = userData();
            bufferedWriter.write("\n" + result);
            bufferedWriter.flush();
        } catch (IOException ioException) {
            throw new HamitMizrakException(" Dosya yazarken hata meydana geldi " + ioException);
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya yazarken hata meydana geldi " + exception);
        }
    }

    //READER(7)
    private static void fileReaderData() throws HamitMizrakException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            StringBuilder stringBuilder = new StringBuilder();
            String rows = "";
            while ((rows = bufferedReader.readLine()) != null) {
                stringBuilder.append(rows).append("\n");
            }
            String dataToString = stringBuilder.toString();
            System.out.println(dataToString);
        } catch (IOException ioException) {
            throw new HamitMizrakException(" Dosya okurne hata meydana geldi " + ioException);
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + exception);
        }
    }

    //Logout(8)
    private static void logout(){
        System.out.println("ÇIKIŞ");
        System.exit(0);
    }

    //chooiseFile
    public static void chooiseFile() throws HamitMizrakException {
        Scanner klavye = new Scanner(System.in);
        //for(;;){}
        while (true) {
            System.out.println("\nLütfen bir seçim yapınız\n1-)Dosya Oluştur\n2-)Dosya Sil\n3-)Dosya Bilgileri\n4-)Rol değiştir\n5-)Bütün Dosyalar\n6-)Yazma\n7-)okuma\n8-)Çıkış");
            int chooise = klavye.nextInt();
            switch (chooise) {

                case 1:
                    System.out.println("Dosya Oluştur");
                    fileCreateData();
                    break;
                case 2:
                    System.out.println("Dosya Sil");
                    fileDeleteData();
                    break;
                case 3:
                    System.out.println("Dosya Bilgileri");
                    fileInformation();
                    break;
                case 4:
                    System.out.println("Rol Değiştir");
                    changeRoles();
                    break;

                case 5:
                    System.out.println("Bütün Dosyalar");
                    allFiles();
                    break;

                case 6:
                    System.out.println("YAZMAK");
                    fileWriterData();
                    break;

                case 7:
                    System.out.println("OKUMAK");
                    fileReaderData();
                    break;

                case 8:
                    logout();
                    break;

                default:
                    System.out.println("Sadece belirtileni seçiniz");
                    break;
            }
        }
    }




    public static void main(String[] args) throws HamitMizrakException {
        chooiseFile();
    }
}

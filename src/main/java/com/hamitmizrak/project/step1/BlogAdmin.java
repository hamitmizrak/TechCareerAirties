package com.hamitmizrak.project.step1;

import java.util.Scanner;

public class BlogAdmin {

    private static Scanner klavye;
    private static int MY_ROLES;
    private FileClass fileClass;

    //parametresiz constructor
    public BlogAdmin() throws BlogException {
        this.fileClass = new FileClass();
    }
    //chooise
    private static int chooise() {
        klavye = new Scanner(System.in);
        System.out.println("Seçim yapınız");
        // 0-)Çıkış
        // 1-)Dosya oluştur
        // 2-)Dosya Yaz
        // 3-)Dosya Oku
        // 4-)Dosya Sil
        // 5-)Dosya Bilgileri
        // 6-)Rol değiştir
        System.out.println("1-)Dosya oluştur\n2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri\n6-)Rol değiştir");
        return klavye.nextInt();
    }
public static void mainMethod(int permission){
        int key=chooise();
        switch (key){
            case 1:
                createDataFile(permission);
                break;
            case 2:
                writeDataFile(permission);
                break;
            case 3:
                readDataFile();
                break;
            case 4:
                deleteDataFile();
                break;
            case 5:
                showFileData();
                break;
            case 6:
                permission();
                break;
            case 7:
                logout();
                break;

            default:
                System.out.println("Belirtilen seçimi yapmadınız");
                break;

        }
}

    private static void logout() {
    }

    private static void allFiles() {
    }

    private static void permission() {
    }

    private static void showFileData() {
    }

    private static void deleteDataFile() {
    }

    private static void readDataFile() {
    }

    private static void writeDataFile(int permission) {
    }

    private static void createDataFile(int permission) {
    }


}

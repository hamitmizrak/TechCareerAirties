package com.hamitmizrak.socket.oneway;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String number;
        try(DataOutputStream dataOutputStream=new DataOutputStream(new Socket("localhost",7777).getOutputStream())){
            System.out.println("Lütfen bir sayı yazınız");
            number= klavye.nextLine();
            dataOutputStream.writeUTF(number);
        }catch (IOException ioException){
            System.out.println("Client Hata meydana geldi");
            ioException.printStackTrace();
        }
    }
}

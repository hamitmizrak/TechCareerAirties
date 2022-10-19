package com.hamitmizrak.socket.oneway;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
// Dikkat: Server her zaman önce çalıştırılır.
public class Server {
    public static void main(String[] args) {
        String clientValue;
        int scannerNumber;
        System.out.println("Server Hazır");
        try(DataInputStream dataInputStream=new DataInputStream(new ServerSocket(7777).accept().getInputStream())) {
            clientValue=dataInputStream.readUTF();
            scannerNumber=Integer.valueOf(clientValue);
            System.out.println("clientten gelen "+scannerNumber+" sayısının karekökü: "+Math.sqrt(scannerNumber));
        }catch (IOException ioException){
            System.out.println("Server Hata meydana geldi");
            ioException.printStackTrace();
        }
    }
}

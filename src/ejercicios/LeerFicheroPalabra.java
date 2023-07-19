package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroPalabra {
    public static void main(String[] args) {
        try{
            FileReader fichero=new FileReader("D:\\UTP 2023\\Taller de Programacion\\fichero1.txt");
            BufferedReader buffer=new BufferedReader(fichero);
            String linea;
            while((linea=buffer.readLine())!=null){
                String[] palabras = linea.split(" ");
                for(String palabra:palabras){
                    System.out.println(palabra);
                }
            }
            buffer.close();
        }catch(IOException io){
            System.out.println(io.getMessage());
        }

    }
}

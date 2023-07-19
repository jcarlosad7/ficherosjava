package Ejercicios;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class EscribirArchivo {
    public static void main(String[] args) {
        try{
            FileOutputStream fichero=new FileOutputStream("D:\\UTP 2023\\Taller de Programacion\\fichero3.txt",true);
            DataInputStream dis=new DataInputStream(System.in);
            char ch;
            System.out.println("Ingrese un caracter y pulsa # para guardar");
            ch= (char) dis.read();
            while(ch!='#'){
                fichero.write(ch);
                ch=(char) dis.read();
                fichero.close();
                dis.close();
            }
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
}

package Ejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EscribirPalabras {
    public static void main(String[] args) {
        try {
            FileOutputStream fichero=new FileOutputStream("D:\\UTP 2023\\Taller de Programacion\\fichero3.txt",true);
            Scanner lector=new Scanner(System.in);
            String palabra;
            System.out.println("Ingrese una palabra y pulse # para guardar");
            palabra = lector.next();
            while(!palabra.equals("#")){
                fichero.write(palabra.getBytes());
                fichero.write(' '); //Alt + 92
                palabra=lector.next();
            }
            fichero.close();
            lector.close();
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
}

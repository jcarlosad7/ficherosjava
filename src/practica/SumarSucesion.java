package practica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumarSucesion {
    public static void main(String[] args) {
        String ruta="D:\\UTP 2023\\Taller de Programacion\\serie.txt";
        int suma=0;
        try{
            FileReader fichero=new FileReader(ruta);
            BufferedReader buffer=new BufferedReader(fichero);
            String linea;
            while((linea=buffer.readLine())!=null){
                String[] palabras = linea.split(" ");
                for(String palabra:palabras){
                    System.out.println(palabra);
                    suma=suma+Integer.parseInt(palabra);
                }
            }
            System.out.println("La suma es: "+suma);
            System.out.println("Fin de lectura");
            buffer.close();
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
}

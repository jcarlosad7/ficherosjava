package practica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumarSucesionFraccion {
    private static double dividirFraccion(String fraccion){
        String[] partes=fraccion.split("/");
        int numerador;
        int denominador;
        if(partes.length==2){
            numerador=Integer.parseInt(partes[0]);
            denominador=Integer.parseInt(partes[1]);
            return (numerador/(double)denominador);
        }
        return 0.0;
    }
    public static void main(String[] args) {
        String ruta="D:\\UTP 2023\\Taller de Programacion\\fraccion.txt";
        double suma=0.0;
        try{
            FileReader fichero=new FileReader(ruta);
            BufferedReader buffer=new BufferedReader(fichero);
            String linea;
            while((linea=buffer.readLine())!=null){
                String[] palabras = linea.split("\n");
                for(String palabra:palabras){
                    System.out.println(palabra);
                    suma=suma+dividirFraccion(palabra);
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

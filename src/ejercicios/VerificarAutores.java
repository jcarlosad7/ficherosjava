package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VerificarAutores {
    public static void main(String[] args) {
        String ruta="D:\\UTP 2023\\Taller de Programacion\\tesis1.txt";
        try {
            FileReader fichero=new FileReader(ruta);
            BufferedReader buffer=new BufferedReader(fichero);
            String linea;
            boolean palabraEncontrada=false;
            while((linea=buffer.readLine()) !=null){
                linea=linea.toLowerCase();
                if(linea.contains("autores")){
                    palabraEncontrada=true;
                    break;
                }
            }
            buffer.close();
            if(palabraEncontrada==true){
                System.out.println("La tesis tiene más de un autor");
            }else{
                System.out.println("La tesis tiene un solo autor");
            }
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
}

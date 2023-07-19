package ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArchivo {
    public static void main(String[] args) {

       try{
            FileInputStream origen=new FileInputStream("D:\\UTP 2023\\Taller de Programacion\\fichero3.txt");
            FileOutputStream destino=new FileOutputStream("D:\\UTP 2023\\Taller de Programacion\\fichero4.txt");
            int ch;
            ch=origen.read();
            while(ch!=-1){
                destino.write(ch);
                ch=origen.read();
            }
            origen.close();
            destino.close();
           System.out.println("Se raalizó la copia correctamente");
       }catch(IOException io){
           System.out.println(io.getMessage());
       }
    }
}

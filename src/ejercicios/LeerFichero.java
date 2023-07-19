package ejercicios;
import java.io.FileInputStream; //
public class LeerFichero {
    public static void main(String[] args) {
        try {
            FileInputStream fichero=new FileInputStream("D:\\UTP 2023\\Taller de Programacion\\fichero1.txt");
            System.out.println("# Datos del archivo #");
            System.out.println("Total de bytes: "+fichero.available());
            int ch=fichero.read();
            while(ch!=-1){
                System.out.println((char) ch);
                ch=fichero.read();
            }
            fichero.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Sigue funcionando");
    }
}

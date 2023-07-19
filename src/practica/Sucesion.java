package practica;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Sucesion {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int terminos;
        int num=1;
        try{
            String ruta="D:\\UTP 2023\\Taller de Programacion\\serie.txt";
            FileOutputStream ficheroSerie=new FileOutputStream(ruta,true);
            System.out.println("Cuántos términos va a tener la sucesión?");
            terminos=lector.nextInt();
            lector.nextLine();
            for(int i=0;i<terminos;i++){
                System.out.println(num);
                ficheroSerie.write(Integer.toString(num).getBytes());
                ficheroSerie.write('\n');
                num=num+3;
            }
            ficheroSerie.close();
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
}

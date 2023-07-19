package practica;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class RegistroNota {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int numEstudiantes=0;
        try{
            FileOutputStream ficheroNotas=new FileOutputStream("D:\\UTP 2023\\Taller de Programacion\\notas.txt",true);
            String palabra;
            double nota;
            String nombre;
            System.out.println("Ingrese la cantidad de estudiantes");
            numEstudiantes=lector.nextInt();
            lector.nextLine();
            for(int i=0;i<numEstudiantes;i++){
                System.out.println("Ingrese nota del Estudiante "+(i+1));
                nota=lector.nextDouble();
                lector.nextLine();
                System.out.println("Ingrese nombre del Estudiante "+(i+1));
                nombre=lector.nextLine();
                ficheroNotas.write((nombre +": "+Double.toString(nota)).getBytes());
                ficheroNotas.write('\n');
            }
            ficheroNotas.close();
        }catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
}

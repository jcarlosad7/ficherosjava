package practica;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SucesionFraccion {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int terminos;
        String fraccion;
        try {
            String ruta = "D:\\UTP 2023\\Taller de Programacion\\fraccion.txt";
            FileOutputStream ficheroSerie = new FileOutputStream(ruta, true);
            System.out.println("Cuántos términos va a tener la sucesión?");
            terminos = lector.nextInt();
            lector.nextLine();
            for (int i = 1; i <= terminos; i++) {
                fraccion = i + "/" + (i + 1);
                System.out.println(fraccion);
                ficheroSerie.write(fraccion.getBytes());
                ficheroSerie.write('\n');
            }
            ficheroSerie.close();
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}

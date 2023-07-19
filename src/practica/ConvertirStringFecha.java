package practica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertirStringFecha {
    public static void main(String[] args) {
        String fechaString = "2023-07-18";
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha = formato.parse(fechaString);
            System.out.println("Fecha convertida: " + fecha);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }
    }
}

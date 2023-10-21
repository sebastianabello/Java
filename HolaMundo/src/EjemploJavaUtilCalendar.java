import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        calendario.set(2020,0,7,19,20,14);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
    }
}

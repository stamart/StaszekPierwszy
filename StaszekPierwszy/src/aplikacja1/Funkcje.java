package aplikacja1;

import java.util.Map;

/**
 * Created by staszek on 2016-02-05.
 */
public class Funkcje {
    public static void main(String[] args) {
        double liczba = 9.0;
        int b = 2;
        int a = 3;
        double pierwiastek = Math.sqrt(liczba);
        double potega = Math.pow(pierwiastek, b);

        System.out.println("Pierwiastek z "+liczba+" wynosi: "+pierwiastek);
        System.out.println("Liczba "+liczba+"podniesiona do potęgi "+b+ " to " +potega);


    }
}

package aplikacja1;

import java.util.Scanner;

/**
 * Created by staszek on 2016-02-04.
 */
public class WlasnyCalc {
    public static void main(String[] args) {
        Double a;
        Double b;
        Scanner odczyt = new Scanner(System.in);


        System.out.println("Podaj pierwszą liczbę: ");
        a = odczyt.nextDouble();

        System.out.println("podaj drugą liczbę: ");
        b = odczyt.nextDouble();

        System.out.println(a+b);

    }
}

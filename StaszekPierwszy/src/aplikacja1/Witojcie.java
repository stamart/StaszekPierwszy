package aplikacja1;

import java.util.Scanner;

/**
 * Created by staszek on 2016-02-04.
 */
public class Witojcie {
    public static void main(String[] args) {
        String jakciezwa;
        Scanner czotoj;
        czotoj = new Scanner(System.in);


        System.out.println("Jak ci na imię");
        jakciezwa = czotoj.nextLine();
        System.out.println("witaj pierdplony "+ jakciezwa);

    }
}

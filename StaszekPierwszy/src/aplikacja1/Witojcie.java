package aplikacja1;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by staszek on 2016-02-04.
 */
public class Witojcie {
    public static void main(String[] args) {
        scanner();



    }

    private static void scanner() {
        String jakciezwa;
        Scanner czotoj = new Scanner(System.in);


        System.out.println("Jak ci na imię");
        jakciezwa = czotoj.nextLine();
        System.out.println("witaj "+ jakciezwa);
    }




}

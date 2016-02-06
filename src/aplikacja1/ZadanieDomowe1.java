package aplikacja1;

import sun.org.mozilla.javascript.internal.regexp.SubString;

/**
 * Created by staszek on 2016-02-02.
 */
public class ZadanieDomowe1 {
    public static void main(String[] args) {
//        int Liczba1 = 23;
//        int Liczba2 = 44;
//        int Liczba3 = 56;

        String h1 = "Super ";
        String h2 = "Partia ";
        String h3 = "Kurwo";
        String h4 = h1+h2+h3;
        System.out.println(h4);

        String h5=h4.substring(6, 12);
        System.out.printf(h5);
        System.out.printf(h4.substring(12, 18));
    }
}

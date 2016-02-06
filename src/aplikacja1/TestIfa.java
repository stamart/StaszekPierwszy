package aplikacja1;

/**
 * Created by staszek on 2016-02-04.
 */
public class TestIfa{
    public static void main(String[] args) {
        int zmienna = 12;
        if(zmienna%2 == 0)

            System.out.println("Liczba parzysta");
        else

            System.out.println("Liczba nie parzysta");

        if (zmienna>10)

                    System.out.println("Liczba większa od 10");

        else if (zmienna>0 && zmienna<=10)
                    System.out.println("Liczba dodatnie mniejsza lub równa 10");
        else System.out.println("Liczba ujemna");
    }

}

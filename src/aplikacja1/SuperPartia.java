package aplikacja1;

/**
 * Created by staszek on 2016-02-02.
 */
public class SuperPartia {
    public static void main(String[] args) {
        String h1 = "Super ";
        String h2 = "Partia ";
        String h3 = h1 + h2;
        System.out.println(h3);

        String h4 = h3.substring(0, 6)+"kurwo";
        System.out.println(h4);

    }
}

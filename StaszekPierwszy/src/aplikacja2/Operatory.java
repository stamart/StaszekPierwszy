package aplikacja2;

/**
 * Created by staszek on 2016-02-02.
 */
public class Operatory {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a+b; //c=a+b, a dopiero później b = b+1;
        c = a+++b; //c=a+b, a następnie a = a+1
        System.out.println(c);
    }
}

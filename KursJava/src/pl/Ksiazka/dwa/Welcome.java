/**
* Program ten wyświetla wiadomość powitalną od autorów.
* @version 1.20 2004-02-28
* @author Cay Horstmann
*/
public class Welcome
{
public static void main(String[] args)
    {
            String[] powitanie = new String[3];
            powitanie[0] = "Witaj, czytelniku!";
            powitanie[1] = "Pozdrowienia od Caya Horstmanna";
            powitanie[2] = "i Gary'ego Cornella";
        for (String g : powitanie)
            System.out.println(g);
    }
}
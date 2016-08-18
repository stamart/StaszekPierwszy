/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.staszek.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie {

    private static String tekst;
    private static String nazwa_pliku;
    
    
    public static void main(String[] args) throws FileNotFoundException {

        odczytZKlawiaturyNazwaPliku();
        odczytZKlawiatury();
        zapis();
        odczyt();
    }

    private static void odczytZKlawiaturyNazwaPliku() {
        Scanner odczyt = new Scanner(System.in);
        
        System.out.println("Wprowadź nazwę pliku: ");
        nazwa_pliku = odczyt.nextLine();

    }
    
    private static void odczytZKlawiatury() {
        Scanner odczyt = new Scanner(System.in);
        
        System.out.println("Wprowadź tekst zapisany do pliku: ");
        tekst = odczyt.nextLine();
        
    }

    private static void zapis() throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter(nazwa_pliku + ".txt");
        zapis.println(tekst);
        zapis.close();
    }

    private static void odczyt() throws FileNotFoundException {
        File plik = new File(nazwa_pliku + ".txt");
        Scanner odczytZpliku = new Scanner(plik);
        
        String zdanie = odczytZpliku.nextLine();
        System.out.println("wprowadzone zdanie " + zdanie);
    }

    
    
    
}

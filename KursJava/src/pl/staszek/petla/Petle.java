/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.staszek.petla;

import java.util.Scanner;

/**
 *
 * @author Turbo
 */
public class Petle {
    
    private static int licznik = 1;
    private static int licznik2 = 1;
    
    
    
    public static void main(String[] args) {
    ustawLicznik2();
    petlaWhile();

    petlaDO();    
    petlaFor();
    }

    private static void petlaWhile() {
        while (licznik<=licznik2){
            System.out.println("liczę do: "+licznik);
            licznik++;
        }
        System.out.println("koniec While");
    }
        
    private static void petlaDO() {
        licznik = -500;
        do{
            System.out.println(licznik);
            licznik++;
        }
        while(licznik<=licznik2);
        System.out.println("KoniecDO");
    }

    private static void petlaFor() {
        for (int licznik = 0; licznik < licznik2; licznik++) {
            System.out.println(licznik);
        }
        System.out.println("Koniec kurwa");
    }

    private static void ustawLicznik2() {
        Scanner ustawlicznik = new Scanner(System.in);
        
        System.out.println("Podaj liczbę: ");
        licznik2 = ustawlicznik.nextInt();
    }
}
        
            

    
    
    

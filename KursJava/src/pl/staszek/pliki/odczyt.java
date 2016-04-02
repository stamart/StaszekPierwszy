/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.staszek.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class odczyt {

    
    
    public static void main(String[] args) throws FileNotFoundException {
        odczyt();
    }

    private static void odczyt() throws FileNotFoundException  {
        File plik = new File("zapisany_plik.txt");
        Scanner wprowadz = new Scanner(plik);
        
        String zdanie = wprowadz.nextLine();
        System.out.println("wprowadzone zdanie " + zdanie);
        
    }
    
}

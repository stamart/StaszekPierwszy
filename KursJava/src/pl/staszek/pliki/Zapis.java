/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.staszek.pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Turbo
 */
public class Zapis {
     public static void main(String[] args) throws FileNotFoundException{
       zapis();
         
  }

    private static void zapis() throws FileNotFoundException {
        
      PrintWriter zapis = new PrintWriter("zapisany_plik.txt");
      zapis.println("Ala ma kota, a kot ma Alę");
      zapis.close();
    }
}

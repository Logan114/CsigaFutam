
package main;

// UML ábrát is kéne készíteni

import java.util.Random;
import java.util.Scanner;


public class Jatek {
    
    public static void main(String[] args) {
        kezdes();
        haladas();
        
    }
    
    static void kezdes(){
        System.out.println("A CsigaFutam elindult...");
    }


    public static int fogadott = fogadas();
    int[] versenyPaly = new int[3];
    static int[] csigaPontok = {0,0,0};
    static String[] csigaNevek = {"csiga1","csiga2","csiga3"};
    
    

    
    static String[] csigaSzinek = {"\u001B[31m","\u001B[34m","\u001B[32m"};
    // piros, kek, zold
    
    
    public static int fogadas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Melyik csigára fogadsz, 1-2-3 ?");
        int fogadott = sc.nextInt();
        System.out.printf("\nA %d-s számú csigára fogadott\n\n",fogadott);
        return fogadott;
        
    }
    public static int[]haladas(){
        Random rnd = new Random();
        for (int i = 0; i < csigaNevek.length; i++) {
            for (int j = 0; j < 5; j++) {
            int lepes = rnd.nextInt(0, 3);
                csigaPontok[i] += lepes;
                System.out.printf("\n%d.kör\n%d.számú csiga pontjai: %d\n",i,i+1,csigaPontok[i]);
            }
        }
        return csigaPontok;
    }

}
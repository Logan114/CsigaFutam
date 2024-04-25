
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
        System.out.println("A CsigaFutam elindult...\n");
    }


    public static int fogadott = fogadas();
    int[] versenyPaly = new int[3];
    static int[] csigaPontok = {0,0,0};
    static String[] csigaNevek = {"csiga1","csiga2","csiga3"};
    
    

    
    static String[] csigaSzinek = {"\u001B[31m","\u001B[34m","\u001B[32m","\\u001b[37m"};
    // piros, kek, zold, feher
    
    
    public static int fogadas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Melyik csigára fogadsz, 1-2-3 ?");
        int fogadott = sc.nextInt();
        System.out.printf("\nA %d-s számú csigára fogadott\n\n",fogadott);
        return fogadott;   
    }
    
    
    
    public static int[]haladas(){
        Random rnd = new Random();
        String sep = "";
        for (int i = 0; i < 5; i++) {
            System.out.printf(sep + "--- %d. kör ---\n",i+1);
            for (int j = 0; j < csigaNevek.length; j++) {
            int lepes = rnd.nextInt(0, 3);
                csigaPontok[j] += lepes;
                System.out.printf(sep + "%s %s pontjai: %d\n",csigaSzinek[j],csigaNevek[j],csigaPontok[j]);
            }
            System.out.println("");
            sep += "   ";
        }
        nyertes();
        return csigaPontok;
    }
    
    
    public static void nyertes(){
        int max = 0;
        String nyertes = "";
        for (int i = 0; i < csigaNevek.length; i++) {
            while (i>0 || i<csigaNevek.length){
                
            int elozo = i-1;
            int elozo_szam = csigaPontok[elozo];
            
            if(csigaPontok[i] > elozo_szam){
                max = csigaPontok[i];
                nyertes = csigaNevek[i];

            }
            }
        }
        System.out.printf("A nyertes: %d", nyertes);
    }
    
    
    
    
    
    
    
    
    // nyertünk e a fogadásunkal vagy nem
    public static void fogadasEredmeny(){
        int semmi = 1;
    }

}
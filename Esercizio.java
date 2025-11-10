//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );

    public static void assegnaMatrice( int[][] matrics, int rigons, int colons, int val ) {
    for (int i=0; i <= rigons-1; i=i+1 ) {
        for (int j=0; j <= colons-1; j=j+1) {
            matrics[i][j] = val;
        }
    }

    }

    public static void azzeraMatrice( int[][] matrics, int rigons, int colons ) {
       assegnaMatrice(matrics, rigons, colons, 0);
    }

    public static void riempiCasuale( int[][] matrics, int rigons, int colons, int nmin, int nmax ) {
        Random rand = new Random();
        for (int i=0; i <= rigons-1; i=i+1 ) {
        for (int j=0; j <= colons-1; j=j+1) {
            matrics[i][j] = nMin + rand.nextInt((nMax+1)-nMin);
        }
    }
    }

    public static void main(String args[]) {
        int rigons = 3;
        int colons = 5;
        int val;
        int[][] matrics = new int[rigos][colons];
        System.out.println("Inserire numero da immettere nella matrice:");
        val = Integer.parseInt( in.nextLine() );
        assegnaMatrice(matrics, colons, rigos, val);
        System.out.println("numero immesso:");
        UtilsMatrice.visualizza(matrics); 


        int[][] matrics1 = new int[rigons][colons];
        azzeraMatrice(matrics1, rigons, colons);
        System.out.println("Matrice vuota:");
        UtilsMatrice.visualizza(matrics1);




        int[][] matrics2 = new int[rigons][colons];
        int nMin = 10;
        int nMax = rigons*colons*10;
        riempiCasuale(matrics2, rigons, colons, nMin, nMax);
        System.out.println("Numeri casuali immessi nella matrice: ");
        UtilsMatrice.visualizza(matrics2);
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md
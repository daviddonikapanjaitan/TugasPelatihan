package com.company;
import  java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int awalinput, pecahan20, pecahan10, pecahan5, pecahan1;
        int sisa20, sisa10, sisa5, sisa1;

        System.out.print("Input uang anda: $ ");
        awalinput = scan.nextInt();

        pecahan20 = awalinput / 20;
        sisa20 = awalinput % 20;

        pecahan10 = sisa20 / 10;
        sisa10 = sisa20 % 10;

        pecahan5 = sisa10 / 5;
        sisa5 = sisa10 % 5;

        pecahan1 = sisa5 / 1;

        System.out.print("Pecahan $20 ada " + pecahan20 + " notes, "
                + "Pecahan $10 ada " + pecahan10 + " notes, " +
                "Pecahan $5 ada " + pecahan5 + " notes, " +
                "Pecahan $1 ada " + pecahan1 + " notes." );
    }
}

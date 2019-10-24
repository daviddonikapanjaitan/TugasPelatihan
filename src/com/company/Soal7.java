package com.company;

import java.util.Scanner;

public class Soal7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int incawal, mil, yard, foot;
        int sisamil, sisayard, sisafoot;
        System.out.print("Masukkan inc robot: ");
        incawal = scan.nextInt();

        mil = incawal / 63360;
        sisamil = incawal % 63360;

        yard = sisamil / 36;
        sisayard = sisamil % 36;

        foot = sisayard / 12;
        sisafoot = sisayard % 12;

        System.out.println("Hasil Tempuh: " + mil + " mil, " + yard + " yard, " + foot + " foot, " + sisafoot + " inch");
    }
}

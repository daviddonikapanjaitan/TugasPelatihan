package com.company;
import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int waktuAwal, minggu, hari, jam, menit, detik;
        int sisaMinggu, sisaHari, sisaJam, sisaMenit, sisaDetik, sisaHarix, sisaJams;
        System.out.print("Masukkan digit waktu: ");
        waktuAwal = scan.nextInt();

        minggu = waktuAwal / 604800;

        sisaHari = waktuAwal % 604800;
        sisaHarix = sisaHari / 86400;

        sisaJams = sisaHari % 86400;
        sisaJam = sisaJams / 3600;

        menit = sisaJams % 3600;
        sisaMenit = menit / 60;

        detik = menit % 60;

        System.out.println("Waktu Anda: " + minggu + " Weeks " + sisaHarix + " Days " + sisaJam
                + " Hours " + sisaMenit + " Minuetes " +
                detik + " detik");
    }
}

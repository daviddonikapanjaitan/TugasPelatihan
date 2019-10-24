package com.company;
import  java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilaiAwal, angka1, angka2, angka3, angka4, angka5;
        System.out.print("Masukkan 5 angka acak: ");
        nilaiAwal = scan.nextInt();

        angka1 = nilaiAwal % 10;
        angka2 = (nilaiAwal/10) % 10;
        angka3 = (nilaiAwal/100) % 10;
        angka4 = (nilaiAwal/1000) % 10;
        angka5 = (nilaiAwal/10000) % 10;

        System.out.println("Hasil: " + angka1 + angka2 + angka3 + angka4 + angka5);
    }
}

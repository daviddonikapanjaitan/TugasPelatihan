package com.company;
import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai, angkaAkhir, totalNilai;
        System.out.print("Masukkan nilai: ");
        nilai = scan.nextInt();
        angkaAkhir = nilai % 10;
        totalNilai = angkaAkhir * 8;
        System.out.println("Total Nilai: " + totalNilai);
    }
}

package com.company;
import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, validasi;
        System.out.print("Silahkan input angka: ");
        input = scan.nextInt();
        validasi = (input + 1)%2;
        System.out.println("Nilai ganji = 1, genap = 0, nilai anda adalah "+ validasi);
    }
}
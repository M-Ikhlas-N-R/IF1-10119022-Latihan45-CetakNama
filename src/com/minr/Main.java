package com.minr;

import java.util.Scanner;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : program mencetak nama
 *
 */
public class Main {
    public static void main(String[] args) {
        int argJmlCetak;
        String argNama;
        Printer user = new Printer();
        Scanner userInput = new Scanner(System.in);

        System.out.println("======Aplikasi Pencetak nama======");
        System.out.print("Masukkan nama anda : ");
        argNama = userInput.nextLine();

        System.out.print("Mau cetak nama berapa kali? : ");
        argJmlCetak = userInput.nextInt();

        user.setNama(argNama);
        user.setJmlCetak(argJmlCetak);

        user.cetak(argNama);
        user.cetak(argJmlCetak, argNama);



    }
}

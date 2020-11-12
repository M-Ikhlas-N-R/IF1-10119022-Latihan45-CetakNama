package com.minr;

public class Printer {
    private int jmlCetak;
    private String nama;

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void cetak(String nama){
        System.out.println("Nama anda : " + nama);
    }

    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak : ");
        for (int i = 1; i <= jmlCetak; i++){
            System.out.printf("%d. %s\n", i, nama);
        }
    }
}

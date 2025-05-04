
package com.mycompany.tugas;

import java.util.Scanner;

public class Percabangan_JerseyMC {
    public static void main(String[] args) {
        String nama_barang = "Jersey Manchester City";
        int harga, jumlah_beli, total_harga;
        double diskon = 0, jumlah_bayar;

        Scanner input = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("========== APLIKASI PEMBELIAN JERSEY ==========");
        System.out.println("===============================================");

        System.out.print("Masukkan Harga Jersey Manchester City : Rp ");
        harga = input.nextInt();

        System.out.print("Masukkan Jumlah Pembelian             : ");
        jumlah_beli = input.nextInt();

        total_harga = harga * jumlah_beli;

        if (total_harga >= 500000) {
            diskon = total_harga * 0.2;
        } else if (total_harga >= 300000) {
            diskon = total_harga * 0.15;
        } else if (total_harga >= 100000) {
            diskon = total_harga * 0.1;
        } else {
            diskon = 0;
        }

        jumlah_bayar = total_harga - diskon;

        System.out.println("\n===============================================");
        System.out.println("=============== STRUK PEMBELIAN ANDA =============");
        System.out.println("Nama Barang         : " + nama_barang);
        System.out.println("Harga per Jersey    : Rp " + harga);
        System.out.println("Jumlah Pembelian    : " + jumlah_beli);
        System.out.println("Total Harga         : Rp " + total_harga);
        System.out.println("Diskon              : Rp " + diskon);
        System.out.println("Jumlah Bayar        : Rp " + jumlah_bayar);
        System.out.println("===================================================");
        System.out.println("      Terima Kasih Telah Membeli Jersey MC!        ");
    }
}

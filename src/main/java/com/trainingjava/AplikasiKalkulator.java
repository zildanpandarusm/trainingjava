package com.trainingjava;

import java.util.ArrayList;
import java.util.Scanner;

public class AplikasiKalkulator {
    public static Integer penjumlahan(Integer nilaiPertama, Integer nilaiKedua){
        return nilaiPertama + nilaiKedua;
    }

    public static Integer pengurangan(Integer nilaiPertama, Integer nilaiKedua){
        return nilaiPertama - nilaiKedua;
    }

    public static Integer perkalian(Integer nilaiPertama, Integer nilaiKedua){
        return nilaiPertama * nilaiKedua;
    }

    public static Integer pembagian(Integer nilaiPertama, Integer nilaiKedua){
        return nilaiPertama / nilaiKedua;
    }

    public static void main(String[] args) {
        int nilai = 0;
        ArrayList<Integer> riwayat = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(nilai != 5){
            Integer nilaiPertama;
            Integer nilaiKedua;
            Integer hasilPerhitungan;
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan : ");
            nilai = scanner.nextInt();

            if (nilai == 5) {
                System.out.println("Riwayat perhitungan: ");
                for (Integer rwt : riwayat) {
                    System.out.print(rwt + " ");
                }
                break;
            } else if (nilai > 5 && nilai <= 0){
                System.out.println("Pilihan yang Anda masukkan tidak tersedia");
                nilai = 5;
            }

            System.out.print("Masukkan nilai pertama : ");
            nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua : ");
            nilaiKedua = scanner.nextInt();

            if (nilai == 1){
                hasilPerhitungan = penjumlahan(nilaiPertama, nilaiKedua);
                riwayat.add(hasilPerhitungan);
                System.out.println("Hasil perhitungan : " + hasilPerhitungan);
            } else if (nilai == 2){
                hasilPerhitungan = pengurangan(nilaiPertama, nilaiKedua);
                riwayat.add(hasilPerhitungan);
                System.out.println("Hasil perhitungan : " + hasilPerhitungan);
            } else if (nilai == 3){
                hasilPerhitungan = perkalian(nilaiPertama, nilaiKedua);
                riwayat.add(hasilPerhitungan);
                System.out.println("Hasil perhitungan : " + hasilPerhitungan);
            } else if (nilai == 4){
                hasilPerhitungan = pembagian(nilaiPertama, nilaiKedua);
                riwayat.add(hasilPerhitungan);
                System.out.println("Hasil perhitungan : " + hasilPerhitungan);
            }
        }
    }
}

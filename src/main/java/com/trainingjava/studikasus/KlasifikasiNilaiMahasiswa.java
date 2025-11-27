package com.trainingjava.studikasus;

import java.util.Scanner;

public class KlasifikasiNilaiMahasiswa {
    public static Double hitungRataRata(Double[] nilai) {
        Double total = 0.00;
        Double rataRata;
        for (int i =0; i < nilai.length; i++){
            total = (Double) (total + nilai[i]);
        }
        rataRata = total / nilai.length;
        return rataRata;
    }

    public static void main (String[] args){
        int jmlNilai = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah nilai siswa :");
        jmlNilai = scanner.nextInt();

        Double[] nilai = new Double[jmlNilai];

        for (int i = 0; i < jmlNilai ; i++){
            System.out.println("Masukkan nilai ke-" + (i + 1) + " : ");
            Double input = scanner.nextDouble();
            nilai[i] = input;
        }

        Double rataRata = hitungRataRata(nilai);
        System.out.println("Rata-rata nilai Anda adalah " + rataRata );
        System.out.print("Oleh karena itu, Anda dinyatakan ");

        if(rataRata >= 70){
            System.out.println("Lulus");
        } else if(rataRata < 70 && rataRata >= 50){
            System.out.println("Remedial");
        } else if (rataRata < 50) {
            System.out.println("Tidak lulus");
        }
    }
}

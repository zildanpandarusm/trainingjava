package com.trainingjava;

import java.util.Scanner;

public class JenisKendaraan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kode jenis kendaraan : ");
        String kode = scanner.nextLine();

        switch (kode) {
            case "M":
                System.out.println("Motor");
                break;
            case "C":
                System.out.println("Mobil");
                break;
            case "B":
                System.out.println("Bus");
                break;
            case "T":
                System.out.println("Truk");
                break;
            default:
                System.out.println("Jenis kendaraan tidak dikenal");
        }
    }
}
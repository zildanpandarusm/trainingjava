package com.trainingjava.studikasus;

import java.util.Scanner;

public class KonversiSuhu {

    public static double celciusKeFahrenheit(double nilaiSuhu){
        return (nilaiSuhu * 9.0/5.0) + 32;
    }

    public static double fahrenheitKeCelcius(double nilaiSuhu){
        return (nilaiSuhu - 32) * 5.0/9.0;
    }

    public static double celciusKeKelvin(double nilaiSuhu){
        return nilaiSuhu + 273.15;
    }

    public static double kelvinKeCelcius(double nilaiSuhu){
        return nilaiSuhu - 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double nilaiSuhu;
        double hasilKonversi;
        boolean lanjutkanKonversi = true;

        do {
            System.out.println("\n===== Menu Konversi Suhu =====");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Fahrenheit ke Celcius");
            System.out.println("3. Celcius ke Kelvin");
            System.out.println("4. Kelvin ke Celcius");
            System.out.println("5. Keluar");
            System.out.println("------------------------------------");
            System.out.print("Masukkan pilihan (1-5): ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next();
                continue;
            }
            scanner.nextLine();

            if (pilihan == 5) {
                lanjutkanKonversi = false;
            } else if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan nilai suhu: ");
                if (scanner.hasNextDouble()) {
                    nilaiSuhu = scanner.nextDouble();
                } else {
                    System.out.println("Input suhu tidak valid. Harap masukkan angka.");
                    scanner.next();
                    scanner.nextLine();
                    continue;
                }
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        hasilKonversi = celciusKeFahrenheit(nilaiSuhu);
                        System.out.printf("\nHasil Konversi: %.2f °C = %.2f °F\n", nilaiSuhu, hasilKonversi);
                        break;
                    case 2:
                        hasilKonversi = fahrenheitKeCelcius(nilaiSuhu);
                        System.out.printf("\nHasil Konversi: %.2f °F = %.2f °C\n", nilaiSuhu, hasilKonversi);
                        break;
                    case 3:
                        hasilKonversi = celciusKeKelvin(nilaiSuhu);
                        System.out.printf("\nHasil Konversi: %.2f °C = %.2f K\n", nilaiSuhu, hasilKonversi);
                        break;
                    case 4:
                        hasilKonversi = kelvinKeCelcius(nilaiSuhu);
                        System.out.printf("\nHasil Konversi: %.2f K = %.2f °C\n", nilaiSuhu, hasilKonversi);
                        break;
                }

                System.out.println("------------------------------------");
                System.out.print("Apakah Anda ingin melakukan konversi lain (y/n)? ");
                String lanjut = scanner.nextLine().trim().toLowerCase();

                if (lanjut.equals("n")) {
                    lanjutkanKonversi = false;
                } else if (!lanjut.equals("y")) {
                    System.out.println("Pilihan tidak valid. Melanjutkan konversi.");
                }

            } else {
                System.out.println("Pilihan yang Anda masukkan tidak tersedia. Harap pilih 1-5.");
            }

        } while (lanjutkanKonversi);

        System.out.println("\nTerima kasih telah menggunakan program Konversi Suhu!");
        scanner.close();
    }
}
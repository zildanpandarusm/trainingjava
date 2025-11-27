package com.trainingjava.studikasus;

import java.util.Scanner;

public class CekStatusUjian {
    public static void inputNilai(){
        Integer nilai = 0;
        Scanner scanner = new Scanner(System.in);

        while(nilai != -1){
            System.out.println("Masukkan nilai ujian :");
            nilai = scanner.nextInt();
            if(nilai >= 70){
                System.out.println("Selamat Anda lulus");
            } else if(nilai >= 50 && nilai < 70){
                System.out.println("Anda harus remedial");
            } else if (nilai < 50) {
                System.out.println("Anda tidak lulus");
            }
        }

    }

    public static void main(String[] args) {
        inputNilai();
    }
}

package com.trainingjava.studikasus;

import java.util.Scanner;

public class KelulusanSiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai siswa : ");
        int nilai = scanner.nextInt();

        if (nilai >= 70){
            System.out.println("Lulus");
        } else if (nilai < 70){
            System.out.println("Tidak Lulus");
        }
    }
}
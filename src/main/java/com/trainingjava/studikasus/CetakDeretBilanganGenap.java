package com.trainingjava.studikasus;

import java.util.Scanner;

public class CetakDeretBilanganGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka (Maksimal 100) : ");
        int angka = scanner.nextInt();

        if(angka > 100){
            System.out.println("Angka yang dmasukkan lebih dari 100");
        } else {
            for (int i = 2; i < angka; i++){
                if(i % 2 == 0){
                    System.out.print(" " + i);
                }
            }
        }
    }
}
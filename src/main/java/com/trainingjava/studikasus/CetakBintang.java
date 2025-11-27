package com.trainingjava.studikasus;

import java.util.Scanner;

public class CetakBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        for (int i = 0; i <= angka; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
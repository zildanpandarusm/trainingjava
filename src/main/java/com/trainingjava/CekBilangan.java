package com.trainingjava;

import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        input.close();
        if(angka > 0){
            System.out.println("Bilangan positif");
        } else if( angka == 0){
            System.out.println("Bilangan nol");
        } else {
            System.out.println("Bilangan negatif");
        }
    }
}
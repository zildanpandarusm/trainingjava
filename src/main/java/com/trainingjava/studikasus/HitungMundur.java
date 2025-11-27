package com.trainingjava.studikasus;

import java.util.Scanner;

public class HitungMundur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        int angka = scanner.nextInt();

        while(angka > 0 || angka == 0){
            System.out.println(angka);
            angka--;
        }
    }
}
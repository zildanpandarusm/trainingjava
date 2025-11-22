package com.trainingjava;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama anda: ");
        String nama = input.nextLine();

        System.out.println("Masukkan usia Anda: ");
        int usia = input.nextInt();

        System.out.println("Halo, " + nama + "! Usia Anda adalah ");

        input.close();
    }
}
package com.trainingjava;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int jumlah = a + b;
        int kurang = a - b;
        int kali = a * b;
        int bagi = a / b;
        int sisa = a % b;

        boolean lebihBesar = a > b;
        boolean samaDengan = a == b;

        System.out.println("Jumlah: " + jumlah);
        System.out.println("Kurang: " + kurang);
        System.out.println("Kali: " + kali);
        System.out.println("Bagi: " + bagi);
        System.out.println("Sisa: " + sisa);
        System.out.println("a lebih besar dari b? " + lebihBesar);
        System.out.println("a sama dengan b? " + samaDengan);
    }
}
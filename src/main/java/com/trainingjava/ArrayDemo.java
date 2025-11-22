package com.trainingjava;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};

        for (int i = 0; i < angka.length; i++){
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
    }
}
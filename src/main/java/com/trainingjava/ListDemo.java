package com.trainingjava;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> namaList = new ArrayList<>();

        namaList.add("Andi");
        namaList.add("Budi");
        namaList.add("Citra");

        for (int i = 0; i < namaList.size(); i++){
            System.out.println("Nama ke-" + (i + 1) + ": " + namaList.get(i));
        }
    }
}
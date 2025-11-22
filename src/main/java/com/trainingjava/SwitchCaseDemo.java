package com.trainingjava;

public class SwitchCaseDemo {
    public static void main(String[] args) {
       int hari = 3;
       String namaHari;

       switch (hari) {
           case 1:
               namaHari = "Senin";
               break;
           case 2:
               namaHari = "Selasa";
               break;
           default:
               namaHari = "Hari tidak valid";
       }

        System.out.println("Hari ke-" + hari + " adalah " + namaHari);
    }
}
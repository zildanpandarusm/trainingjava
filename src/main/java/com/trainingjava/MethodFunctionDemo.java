package com.trainingjava;

public class MethodFunctionDemo {
    public  int hitungLuas(int sisi){
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        MethodFunctionDemo obj = new MethodFunctionDemo();
        int hasil = obj.hitungLuas(5);
        System.out.println("Luas persegi: " + hasil );
    }
}
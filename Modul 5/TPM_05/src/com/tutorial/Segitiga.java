package com.tutorial;

public class Segitiga extends BangunDatar{
    public float alas, tinggi; // Atribut alas dan tinggi segitiga

    // Constructor
    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    // method luas untuk menghitung luas segitiga
    public float luas() {
        return (alas * tinggi) / 2;
    }
    
    @Override
    public float keliling() {
        // Keliling hanya dihitung jika semua sisi diketahui
        float s = (float) (alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi)) / 2;
        return s;

    }
}

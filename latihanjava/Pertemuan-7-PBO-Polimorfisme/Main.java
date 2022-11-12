/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Persegi persegi = new Persegi();

        // Lingkaran
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling() + "\n");

        // Segitiga
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling() + "\n");

        // Persegi
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling() + "\n");
    }
}

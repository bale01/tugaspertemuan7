/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Segitiga extends BangunDatar {
    protected final int alas = 5;
    protected final int tinggi = 10;

    public float luas(){
        return (float) (0.5 * this.alas * this.tinggi);
    }

    public float keliling(){
        return (float) (3 * this.alas);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Persegi extends BangunDatar {
    private final double sisi = 5;

    public float luas(){
        return (float) (this.sisi * this.sisi);
    }

    public float keliling(){
        return (float) (4 * this.sisi);
    }
}
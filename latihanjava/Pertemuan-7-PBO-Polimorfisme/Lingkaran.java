/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Lingkaran extends BangunDatar{
    protected final int r = 10;

    public float luas(){
        double phi = 3.14;
        return (float) (phi * r * r);
    }

    public float keliling(){
        double phi = 3.14;
        return (float) (2 * phi * r);
    }
}

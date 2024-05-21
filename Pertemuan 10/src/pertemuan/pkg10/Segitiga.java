/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg10;

/**
 *
 * @author Muhammad Fachril R
 */
public class Segitiga extends Bangun_datar {
    public int alas;
    public int tinggi;
    
    Segitiga(){
        alas = 1;
        tinggi = 1;
    }
    
    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float luas(){
    return (float) alas * tinggi / 2;
    }
}

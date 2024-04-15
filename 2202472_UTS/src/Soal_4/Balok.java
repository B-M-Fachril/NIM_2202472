/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_4;

/**
 *
 * @author Muhammad Fachril R
 */
public class Balok {
    int Panjang;
    int Lebar;
    int tinggi;
    
    public Balok(){
        Panjang = 0;
        Lebar = 0;
        tinggi = 0;
    }
    
    public Balok(int a,int b,int c){
        Lebar = b;
        Panjang = a;
        tinggi = c;
    }
    
    int Get_Luas(){
        int hasil = 2 * ((Panjang * Lebar) + (Panjang * tinggi) + (Lebar * tinggi));
        return hasil;
    }
    int Get_Keliling(){
        int hasil = 4 * (Panjang + Lebar + tinggi);
        return hasil;
    }
    
    int Get_Volume(){
        int hasil = (Panjang * Lebar * tinggi);
        return hasil;
    }
    
    void set_panjang(int a){
        Panjang = a;
    }
    void set_lebar(int b){
        Lebar = b;
    }
    void set_tinggi(int c){
        tinggi = c;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg10;

/**
 *
 * @author Muhammad Fachril R
 */
public class Persegi extends Bangun_datar {
    int sisi;
    
    Persegi(){
        sisi = 1;
    }
    
    Persegi (int sisi){
        this.sisi = sisi;
    }
    
    @Override
    public float luas(){
        return sisi * sisi;
    }
    
    @Override
    public float keliling(){
        return 4 * sisi;
    }
    
}

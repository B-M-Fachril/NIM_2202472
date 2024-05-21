/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg10;

/**
 *
 * @author Muhammad Fachril R
 */
public class Lingkaran extends Bangun_datar {
    public int r;
    
    Lingkaran(){
        r = 1;
    }
    
    Lingkaran(int r ){
        this.r = r;
    }
    
    @Override
    public float luas(){
        return (float) ((float) r * r * Math.PI);
    }
    
    @Override
    public float keliling(){
        return (float) ((float) 2 * r * Math.PI);
    }
}

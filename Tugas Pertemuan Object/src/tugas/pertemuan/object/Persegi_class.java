
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pertemuan.object;

/**
 *
 * @author Muhammad Fachril R
 */
public class Persegi_class {
    int Panjang;
    int Lebar;
    
    public Persegi_class(){
        Panjang = 0;
        Lebar = 0;
    }
    
    public Persegi_class(int a,int b){
        Lebar = b;
        Panjang = a;
    }
    
    int LuasPers(){
        int hasil = Panjang * Lebar;
        return hasil;
    }
    int KelilingPers(){
        int hasil = Panjang + Panjang + Lebar + Lebar;
        return hasil;
    }
    void set_panjang(int a){
        Panjang = a;
    }
    void set_lebar(int b){
        Lebar = b;
    }
}

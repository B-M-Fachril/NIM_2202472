/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pertemuan.object;


/**
 *
 * @author Muhammad Fachril R
 */
public class Persegi_Panjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Persegi_class persegi_p1 = new Persegi_class();
        persegi_p1.set_panjang(1);System.out.println("Panjang = "+(persegi_p1.Panjang));
        persegi_p1.set_lebar(1);System.out.println("Lebar = "+(persegi_p1.Lebar));
        System.out.println("Luasnya = "+ (persegi_p1.LuasPers()));
        System.out.println("kelilingnya = "+ (persegi_p1.KelilingPers()));
        
        Persegi_class persegi_p2 = new Persegi_class();
        persegi_p2.set_panjang(30);System.out.println("Panjang = "+(persegi_p2.Panjang));
        persegi_p2.set_lebar(45);System.out.println("Lebar = "+(persegi_p2.Lebar));
        System.out.println("Luasnya = "+ (persegi_p2.LuasPers()));
        System.out.println("kelilingnya = "+ (persegi_p2.KelilingPers()));
        
        Persegi_class persegi_p3 = new Persegi_class();
        persegi_p3.set_panjang(25);System.out.println("Panjang = "+(persegi_p3.Panjang));
        persegi_p3.set_lebar(35);System.out.println("Lebar = "+(persegi_p3.Lebar));
        System.out.println("Luasnya = "+ (persegi_p3.LuasPers()));
        System.out.println("kelilingnya = "+ (persegi_p3.KelilingPers()));
        
        
         
        
    }
    
}

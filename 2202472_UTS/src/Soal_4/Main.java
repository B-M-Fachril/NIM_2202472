/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Soal_4;

/**
 *
 * @author Muhammad Fachril R
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Balok balok_1 = new Balok();
        balok_1.set_panjang(1);
        balok_1.set_lebar(1);
       balok_1.set_tinggi(1);
       System.out.println("Balok dengan Panjang : " + (balok_1.Panjang) + ", Lebar : " + (balok_1.Lebar)+ " ,dan Tinggi : " + (balok_1.tinggi) + ". Luasnya : " + (balok_1.Get_Luas()) + " sedangkan");
       System.out.println("kelilingnya : " + (balok_1.Get_Keliling())+ " dan Volumenya : " + (balok_1.Get_Volume()));
       
       Balok balok_2 = new Balok();
        balok_2.set_panjang(30);
        balok_2.set_lebar(40);
       balok_2.set_tinggi(50);
       System.out.println("Balok dengan Panjang : " + (balok_2.Panjang) + ", Lebar : " + (balok_2.Lebar)+ " ,dan Tinggi : " + (balok_2.tinggi) + ". Luasnya : " + (balok_2.Get_Luas()) + " sedangkan");
       System.out.println("kelilingnya : " + (balok_2.Get_Keliling())+ " dan Volumenya : " + (balok_2.Get_Volume()));
       
       Balok balok_3 = new Balok();
        balok_3.set_panjang(25);
        balok_3.set_lebar(35);
       balok_3.set_tinggi(45);
       System.out.println("Balok dengan Panjang : " + (balok_3.Panjang) + ", Lebar : " + (balok_3.Lebar)+ " ,dan Tinggi : " + (balok_3.tinggi) + ". Luasnya : " + (balok_3.Get_Luas()) + " sedangkan");
       System.out.println("kelilingnya : " + (balok_3.Get_Keliling())+ " dan Volumenya : " + (balok_3.Get_Volume()));
    }
}

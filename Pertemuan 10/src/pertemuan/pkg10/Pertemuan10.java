/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg10;

/**
 *
 * @author Muhammad Fachril R
 */
public class Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
    Bangun_datar baru = new Bangun_datar();
    Persegi persegi = new Persegi();
    Lingkaran lingkaran = new Lingkaran();
    Segitiga segitiga = new Segitiga();
    
    baru.luas();
    baru.keliling();
    System.out.println("Luas persegi : "+ persegi.luas());
    System.out.println("Keliling persegi : "+ persegi.keliling());
    System.out.println("Luas lingkaran : "+ lingkaran.luas());
    System.out.println("Keliling lingkaran : "+ lingkaran.keliling());
    System.out.println("Luas segitiga : "+ segitiga.luas());
    }
}

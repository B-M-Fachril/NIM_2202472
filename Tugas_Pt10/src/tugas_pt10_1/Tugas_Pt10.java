/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pt10_1;
import java.util.Scanner;
/**
 *
 * @author Muhammad Fachril R
 */
public class Tugas_Pt10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baru = new Scanner(System.in);
        Segitiga segitiga = new Segitiga();
        double sisi1;
        System.out.println("Masukan nilai panjang sisi 1 : ");
        sisi1 = baru.nextDouble();
        double sisi2;
        System.out.println("Masukan nilai panjang sisi 2 : ");
        sisi2 = baru.nextDouble();
        double sisi3;
        System.out.println("Masukan nilai panjang sisi 3 : ");
        sisi3 = baru.nextDouble();
        String color;
        System.out.println("Masukan warna segitiga : ");
        color = baru.next();
        segitiga.setsisi1(sisi1);
        segitiga.setsisi2(sisi2);
        segitiga.setsisi3(sisi3);
        segitiga.setColor(color);
        segitiga.setFilled();
        segitiga.getDateCreated();
        
        System.out.println("\n\n\n==========Hasil==========\n");
        System.out.println("Created :"+segitiga.getDateCreated());
        System.out.println("Warnanya :"+segitiga.getColor());
        System.out.println("Filled :"+segitiga.filled);
        System.out.println("Luas :"+segitiga.getArea()+"\nKeliling"+segitiga.getPerimeter()+"\n"+segitiga.toString());
        
    }
    
}

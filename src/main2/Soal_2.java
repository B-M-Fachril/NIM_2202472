/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package main2;
import java.util.Scanner;
/**
 *
 * @author Muhammad Fachril R
 */
public class Soal_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        long tabunganmu ;
        System.out.println("Masukan nilai saldo Tabungan anda : ");
        tabunganmu = input.nextLong();
        System.out.println(tabunganmu);
        boolean pasangan;
        System.out.println("Sudah punya pasangan ? [true/false] : ");
        pasangan = input.nextBoolean();
        
        if((tabunganmu > 100000000)&&(pasangan == true)){
            System.out.println("Sudah siap dalam Pernikahan");
        }else{
            System.out.println("Belum siap dalam Pernikahan");
        }
        
        
        
    }
}

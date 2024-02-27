/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
/**
 *
 * @author Muhammad Fachril R
 */
public class Soal_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
        float bilangan_1;
        float bilangan_2;
        float bilangan_3;
        
        System.out.println("Masukan nilai bilangan pertama : ");
        bilangan_1 = myObj.nextFloat();
        System.out.println("Masukan nilai bilangan kedua : ");
        bilangan_2 = myObj.nextFloat();
        System.out.println("Masukan nilai bilangan ketiga : ");
        bilangan_3 = myObj.nextFloat();
        
        /*
        System.out.println(bilangan_1);
        System.out.println(bilangan_2);
        System.out.println(bilangan_3);
*/
        if (( bilangan_1  <  0) && ( bilangan_2 < 0) && ( bilangan_3 < 0)){
             System.out.println("Hasil Penjumlahan ==> " + bilangan_1 +" + "+bilangan_2+" + "+ bilangan_3+" = " + (bilangan_1 + bilangan_2 + bilangan_3));
             System.out.println("Hasil Pengurangan ==>  (" + bilangan_1 +" ) - ( "+ bilangan_2 +") - ("+ bilangan_3 +") = " + (bilangan_1 - bilangan_2 - bilangan_3));
             System.out.println("Hasil Perkalian ==> " + bilangan_1 +" x "+bilangan_2 +" x "+ bilangan_3+" = " + (bilangan_1 * bilangan_2 * bilangan_3));
             System.out.println("Hasil Pembagian ==> " + bilangan_1 +" : "+bilangan_2 +" : "+ bilangan_3+" = " + ((bilangan_1 / bilangan_2) / bilangan_3));
        }else{
            System.out.println("salah satu dari ketiga bilangan tidak dalam kondisi dibawah 0 ");
        }
    }
    
}

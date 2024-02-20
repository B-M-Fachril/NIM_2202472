/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package main_3;
import java.util.Scanner;
/**
 *
 * @author Muhammad Fachril R
 */
public class Soal_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
         char huruf_pertama;
         char huruf_kedua;
         
         System.out.println("Masukan huruf pertama : ");
         huruf_pertama = input.next().charAt(0);
         System.out.println("Masukan huruf kedua : ");
         huruf_kedua = input.next().charAt(0);
         
         int bilangan1;
         int bilangan2;
         
         bilangan1 = (int)huruf_pertama;
         bilangan2 = (int)huruf_kedua;
         
         System.out.println("Maka huruf " + (huruf_pertama) +"dengan ASCII = " + (bilangan1));
         System.out.println("Maka huruf " + (huruf_kedua) +"dengan ASCII = " + (bilangan2));
         System.out.println("Dijumlahkan menjadi =  " + (bilangan1+bilangan2) );
         
        // TODO code application logic here
        
    }
}

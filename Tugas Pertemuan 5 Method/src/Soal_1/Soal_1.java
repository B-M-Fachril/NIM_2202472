/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal_1;

import java.util.Scanner;

/**
 *
 * @author Muhammad Fachril R
 */
public class Soal_1 {
public static void Ribuancek(int a){
         if(a >999 && a<=9999){
            System.out.println("Bilangan  "+(a)+"  ini Ribuan ");
        }else{
        System.out.println("Bilangan  "+(a)+"  ini tidak  Ribuan ");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Masukan bilangan pertama :");
        a = input.nextInt();    //Meminta inputan user
        System.out.println("Masukan bilangan Kedua :");
        b = input.nextInt();    //Meminta inputan user
        System.out.println("Masukan bilangan ketiga :");
        c = input.nextInt();    //Meminta inputan user
        
        Ribuancek(a);
        Ribuancek(b);
        Ribuancek(c);
        
    }
    
}

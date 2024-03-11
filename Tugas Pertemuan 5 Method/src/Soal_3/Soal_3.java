/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Soal_3;

import java.util.Scanner;

/**
 *
 * @author Muhammad Fachril R
 */
public class Soal_3 {
public static void Pola(int n){
     if(n >= 1 && n<= 1000){
        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=i;j++){
            System.out.print(" * ");
                }
                System.out.println("  ");
            }
        }else{
            System.out.println("Nilai tidak sesuai :");
        }
        
        // TODO code application logic here
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Masukan sebuah nilai : dengan rentang 1 - 1000");
        n = input.nextInt();
        Pola(n);
    }
}

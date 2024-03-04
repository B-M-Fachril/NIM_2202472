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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Masukan sebuah nilai : dengan rentang 1 - 100");
        n = input.nextInt();
        if(n >= 1 && n<= 100){
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
}

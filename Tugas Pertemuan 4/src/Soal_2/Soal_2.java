/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Soal_2;
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
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Masukan batas awal : 1 - 100");
        a = input.nextInt();
        System.out.println("Masukan batas akhir : 1 - 100");
        b = input.nextInt();
        
        if(a <= b && a>=1 && b>=1 && a<=100 & b<=100){
            for(int bilangan = a;bilangan <=b;bilangan++){
            int hitung = 0;
            int prima = 0;
            for(hitung=a;hitung<=b;hitung++){
                if(bilangan % hitung == 0){
                    prima++;
                }
            }
            if(prima == 2){
                System.out.print(bilangan+" , ");
            }
            if(bilangan % 10 == 0){
                System.out.println("  ");
                }
            }
        }else if(a > b && a>=1 && b>=1 && a<=100 & b<=100){
            System.out.println(" Kamu sedang mencari apa ?");
        }else if(a<1 || b<1){
            System.out.println(" Bilangan inputan harus positif");
        }else if(a>100 || b> 100){
            System.out.println(" Bilangan terlalu besar");
        }else{
            System.out.println(" Operasi tidak dapat dilakukan");
            }
        }
        
        
        
        // TODO code application logic here
    }


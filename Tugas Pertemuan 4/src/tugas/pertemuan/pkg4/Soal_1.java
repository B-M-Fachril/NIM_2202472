/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pertemuan.pkg4;
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
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Masukan bilangan pertama :");
        a = input.nextInt();    //Meminta inputan user
        System.out.println("Masukan bilangan Kedua :");
        b = input.nextInt();    //Meminta inputan user
        System.out.println("Masukan bilangan ketiga :");
        c = input.nextInt();    //Meminta inputan user
        
        if(a >999 && a<=9999){
            System.out.println("Bilangan  "+(a)+"  ini Ribuan ");
        }else{
        System.out.println("Bilangan  "+(a)+"  ini tidak  Ribuan ");
        }
        
        if(b >999 && b<=9999){
            System.out.println("Bilangan  "+(b)+" ini  Ribuan ");
        }else{
            System.out.println("Bilangan  "+(b)+" ini tidak  Ribuan ");
        }
        
        if(c >999 && c<=9999){
            System.out.println("Bilangan "+(c)+"  ini Ribuan ");
        }else{
        System.out.println("Bilangan "+(c)+"  ini tidak  Ribuan ");
        }
        
        // TODO code application logic here
    }
    
}

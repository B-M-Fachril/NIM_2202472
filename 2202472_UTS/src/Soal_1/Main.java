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
public class Main {
    static int balikan(int bilangan){
        int hasil = 0;
        while(bilangan > 0){
            hasil = hasil * 10 + bilangan % 10;
            bilangan = bilangan / 10;
        }
        
        return hasil;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baru = new Scanner(System.in);
        System.out.println("Masukan bilangan 3 digit");
        int bilangan =  baru.nextInt();
        if(bilangan > 99 && bilangan <=999){
            int hasil = balikan(bilangan);
            if(bilangan == hasil){
                System.out.println(bilangan + " adalah polindrom");
            }else{
                System.out.println(bilangan + " adalah bukan polindrom");
            }
        }else{
            System.out.println("Bilangan yang diinput harus 3 digit tak lebih atau kurang");
        }
        
        
        // TODO code application logic here
    }
    
}

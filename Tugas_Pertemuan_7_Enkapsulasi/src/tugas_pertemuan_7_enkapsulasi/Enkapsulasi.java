/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tugas_pertemuan_7_enkapsulasi;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Muhammad Fachril R
 */
public class Enkapsulasi {
    
    public static int[] dapatkanbilangan(){
    Random acak = new Random();
    int[] a = new int[100000];
    for(int i = 0;i < a.length;i++){
            a[i] = ((int)(acak.nextInt(100000)));
            while(a[i] == 0){
                a[i] = ((int)(acak.nextInt(100000)));
            }
        }
    return a;
    }
    
    public static void selectionSort(int[] a){
        for(int i = 0;i< a.length;i++){
           int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        
        for(int i = 0;i<100;i++){
            System.out.print(a[i]+" ");
            if(i%10 == 0){
                System.out.println(" ");
            }
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Enkapsulasi_class mulai = new Enkapsulasi_class();
        int pilih = 1;
        
        while(pilih != 2){
            System.out.println("Menu");
            System.out.println("[1]. Mulai");
            System.out.println("[2]. Exit");
            pilih = input.nextInt();
            
            if(pilih == 1){
            mulai.start();
            int[] bilangan = dapatkanbilangan();
            selectionSort(bilangan);
            mulai.stop();
            
            long hasil = mulai.getElapsedTime();
             System.out.println(" ");
            System.out.println(hasil + "milisekon");
            }if(pilih == 2){
                break;
            }
        }
    }
}

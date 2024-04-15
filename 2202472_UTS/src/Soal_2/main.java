/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Soal_2;
/**
 *
 * @author Muhammad Fachril R
 */
public class main {
    public static void pola_1(int a){
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        } 
    }
    
     public static void pola_2(int a){
        for(int i = a;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        } 
    }
     
        public static void pola_3(int a){
            int b = a;
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<b;j++){
                System.out.print("  ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j+" ");
            }
            
            System.out.println("");
            b--;
        } 
    }
        
         public static void pola_4(int a){
             int b = a;
             int c = 1;
           for(int i = a;i>=1;i--){
               for(int j = 1;j<c;j++){
                   System.out.print("  ");
               }
               for(int j = 1;j<=b;j++){
                   System.out.print(j+" ");
               }
               
               System.out.println(" ");
               b--;
               c++;
           }
         }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int n = 6;
        System.out.println(" Pattern A");
        pola_1(n);
        System.out.println(" ");
        System.out.println(" Pattern B");
        pola_2(n);
        System.out.println(" ");
        System.out.println(" Pattern C");
        pola_3(n);
        System.out.println(" ");
        System.out.println(" Pattern D");
        pola_4(n);
        System.out.println(" ");
        // TODO code application logic here
    }
}

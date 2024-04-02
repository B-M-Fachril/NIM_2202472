/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan_7_enkapsulasi;
/**
 *
 * @author Muhammad Fachril R
 */
public class Enkapsulasi_class {
    private long Start_time;
    private long End_time;
    
    public Enkapsulasi_class(){
        Start_time = 0;
        End_time = 0;
    }
    
    void start(){
        Start_time =  System.currentTimeMillis() ;
        End_time = 0;
    }
    
    void stop(){
        End_time = System.currentTimeMillis();
    }
    
    long getElapsedTime(){
    long hasil;
    hasil = End_time - Start_time;
        return hasil;
    }
    
}

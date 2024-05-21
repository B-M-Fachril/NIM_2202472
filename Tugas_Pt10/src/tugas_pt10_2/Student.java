/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pt10_2;

/**
 *
 * @author Muhammad Fachril R
 */
public class Student extends Person{
    private String status;
    static final String tahun_pertama = "Mahasiswa Baru";
    static final String tahun_kedua = "Mahasiswa Tahun berikutnya";
    static final String junior = "Junior";
    static final String senior = "Senior";
    
    public Student(String a, String b, String c, String d, String status){
        super(a,b,c,d);
        this.status = status;
    }
    
    public void set_status(String status){
        status = status;
    }
    
    public String get_status(){
        return this.status;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nStatusnya : " + get_status();
    }
}

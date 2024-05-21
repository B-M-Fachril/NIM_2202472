/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pt10_2;

/**
 *
 * @author Muhammad Fachril R
 */
public class Faculty extends Employee {
    public String jam_kerja;
    private String jabatan;
    
    public Faculty(String jam_kerja,String jabatan,String a,String b,String c,String d,String e,int f,MyDate g){
        super(a,b,c,d,e,f,g);
        jabatan = jabatan;
        jam_kerja = jam_kerja;
        
    }
    
    public void set_jam_kerja(String jam_kerja){
        jam_kerja = jam_kerja;
    }
    
    public String get_jam_kerja(){
        return jam_kerja;
    }
    
    public void set_jabatan(String jabatan){
        jabatan = jabatan;
    }
    
    public String get_jabatan(){
        return jabatan;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nShift : "+ this.get_jam_kerja()+"\nJabatan : "+this.get_jabatan();
    }
}

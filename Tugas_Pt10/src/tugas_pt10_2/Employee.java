/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pt10_2;

/**
 *
 * @author Muhammad Fachril R
 */
public class Employee extends Person {
    private String departmen;
    private int pemasukan;
    private MyDate tanggal_bekerja;
    
    public Employee(String a,String b,String c,String d,String e,int f,MyDate g){
        super(a,b,c,d);
        this.departmen =e;
        this.pemasukan = f;
        this.tanggal_bekerja = g;
    }
    
    public void set_Department(String e){
        this.departmen = e;
    }
    public String get_Department(){
        return this.departmen;
    }
    
    public void set_Income(int f){
        this.pemasukan = f;
    }
    public int get_Income(){
        return this.pemasukan;
    }
    
    public void set_date_of_employment(MyDate g){
        this.tanggal_bekerja = g;
    }
    public MyDate get_date_of_employment(){
        return this.tanggal_bekerja;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nDepartemen : "+this.get_Department()+"\nPenghasilan : "+this.get_Income()+"\nMulai bekerja : "+ this.get_date_of_employment();
    }
}

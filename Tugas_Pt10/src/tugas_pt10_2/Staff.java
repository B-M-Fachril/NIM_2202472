/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pt10_2;

/**
 *
 * @author Muhammad Fachril R
 */
public class Staff extends Employee {
    private String gelar;
    
    public Staff(String gelar,String a,String b,String c,String d,String e,int f,MyDate g){
        super(a,b,c,d,e,f,g);
        this.gelar = gelar;
    }
    
    public String get_Title(){
        return this.gelar;
    }
    
    public void set_Title(String gelar){
        this.gelar = gelar;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\ngelar: " + get_Title();
    }
}

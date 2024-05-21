/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pt10_2;

/**
 *
 * @author Muhammad Fachril R
 */
public class Person {
    private String name;
    private String address;
    private String contact;
    private String email;
    
    public Person(){
        this.name = "Unknown";
        this.address = "Unknown";
        this.contact = "Unknown";
        this.email = "Unknown";
    }
    
    public Person(String a,String b,String c,String d){
        this.name = a;
        this.address = b;
        this.contact = c;
        this.email = d;
    }
    
    public void Set_Name(String a){
        this.name = a;
    }
    
    public String Get_Name(){
        return this.name;
    }
    
    public void Set_Address(String b){
        this.address = b;
    }
    
    public String Get_Address(){
        return this.address;
    }
    
    public void Set_Contact(String c){
        this.contact = c;
    }
    
    public String Get_Contact(){
        return this.contact;
    }
    
    public void Set_Email(String d){
        this.email = d;
    }
    
    public String Get_Email(){
        return this.email;
    }
    
    @Override
    public String toString(){
        return "nama : " + this.Get_Name()+"\nalamat : " + this.Get_Address()+"\nnomor kontak : "+this.Get_Contact()+"\nemail : "+this.Get_Email();
    }
    
}

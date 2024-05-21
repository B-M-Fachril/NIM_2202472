/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pt10_1;

/**
 *
 * @author Muhammad Fachril R
 */
public class Segitiga extends Objek_Geogmetri{
    public double sisi1;
    public double sisi2;
    public double sisi3;

  public Segitiga() {
  }

  public Segitiga(double a,double b,double c) {
    this.sisi1 = a;
    this.sisi2 = b;
    this.sisi3 = c;
  }

  public Segitiga(double a,double b, double c,String color, boolean filled) {
    this.sisi1 = a;
    this.sisi2 = b;
    this.sisi3 = c;
    this.setColor(color);
    this.setFilled();
  }

  /** Return width */
  public double getsisi1() {
    return sisi1;
  }

  /** Set a new width */
  public void setsisi1(double a) {
    this.sisi1 = a;
  }

   /** Return width */
  public double getsisi2() {
    return sisi2;
  }

  /** Set a new width */
  public void setsisi2(double b) {
    this.sisi2 = b;
  }
  
    /** Return width */
  public double getsisi3() {
    return sisi3;
  }

  /** Set a new width */
  public void setsisi3(double c) {
    this.sisi3 = c;
  }
  
  /** Return area */
  public double getArea() {
      double luas = 0.0;
      double tinggi = 0.0;
      
      if(sisi1 == sisi2 && sisi1 == sisi3){
          System.out.println("Kem 1");
          tinggi = Math.sqrt(Math.pow(sisi1, 2) - Math.pow((sisi2/2), 2));
          luas = sisi1 * tinggi / 2;
      }else{
          if(sisi1 == sisi2 && sisi1 != sisi3){
              System.out.println("Kem 2");
              tinggi = Math.sqrt(Math.pow(sisi1, 2) - Math.pow((sisi3/2), 2));
               luas = sisi1 * tinggi / 2;
          }else if(sisi1 == sisi3 && sisi1 != sisi2){
              System.out.println("Kem 3");
              tinggi = Math.sqrt(Math.pow(sisi1, 2) - Math.pow((sisi2/2), 2));
              luas = sisi1 * tinggi / 2;
          }else if(sisi2 == sisi3 && sisi1 != sisi2){
              System.out.println("Kem 4");
              tinggi = Math.sqrt(Math.pow(sisi2, 2) - Math.pow((sisi1/2), 2));
              luas = sisi2 * tinggi / 2;
          }else{
              double s = (this.sisi1+this.sisi2+this.sisi3)/2;
              luas = Math.sqrt((s*(s-this.sisi1)*(s-this.sisi2)*(s-this.sisi3)));
          } 
      }
      System.out.println("Tinggi :"+tinggi);
    return luas;
  }

  /** Return perimeter */
  public double getPerimeter() {
    return (sisi1 + sisi2 + sisi3);
  }
  
  @Override
  public String toString(){
      return "Segitiga dengan sisi 1 : "+this.sisi1+", Sisi 2 : "+this.sisi2+", Sisi 3 : "+this.sisi3;
  }

}

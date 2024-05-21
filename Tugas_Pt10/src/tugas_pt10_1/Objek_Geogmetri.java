/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pt10_1;

/**
 *
 * @author Muhammad Fachril R
 */
public class Objek_Geogmetri {
    public String color;
    public boolean filled;
    private java.util.Date dateCreated;
  
  /** Construct a default geometric object */
  public Objek_Geogmetri(){
     this.color = "putih";
  }

  /** Construct a geometric object with the specified color 
    *  and filled value */
  public Objek_Geogmetri(String color, boolean filled) {
     dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean, 
     its get method is named isFilled
     * @return  */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled() {
    if("Putih".equals(this.color)){
        this.filled = false;
    }else if("putih".equals(this.color)){
        this.filled = false;
    }else if("White".equals(this.color)){
        this.filled = false;
    }else if("white".equals(this.color)){
        this.filled = false;
    }else{
        this.filled = true;
    }
  }
  
  public java.util.Date getDateCreated() {
    return dateCreated = new java.util.Date();
  }
  
  /** Return a string representation of this object */
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + 
      " and filled: " + filled;
  }
}

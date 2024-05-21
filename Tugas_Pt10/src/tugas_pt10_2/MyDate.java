/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pt10_2;

import java.util.Calendar;

/**
 *
 * @author Muhammad Fachril R
 */
public class MyDate {
     private int Years;
    private int Month;
    private int Date;
    
    MyDate(){
        Calendar calender = Calendar.getInstance();
        this.Years = calender.get(Calendar.YEAR);
        this.Month = calender.get(Calendar.MONTH);
        this.Date = calender.get(Calendar.DAY_OF_MONTH);
    }
    
    MyDate(long a){
        set_Date(a);
    }
    
    public int get_Years(){
        return this.Years;
    }
    
    public String get_Month(){
        String b = String.valueOf(Month + 1);
        return (Month < 10 ? "0" + b : b);
    }
    
    public String get_Date(){
        String t = String.valueOf(Date);
        return (Date < 10 ? "0" + t : t);
    }
    
    public void set_Date(long a){
        Calendar kalender = Calendar.getInstance();
        kalender.setTimeInMillis(a);
        this.Years = kalender.get(Calendar.YEAR);
        this.Month = kalender.get(Calendar.MONTH);
        this.Date = kalender.get(Calendar.DAY_OF_MONTH);
    }
}

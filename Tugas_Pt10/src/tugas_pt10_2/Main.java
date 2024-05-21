/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tugas_pt10_2;

/**
 *
 * @author Muhammad Fachril R
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //inisialisasi Person
        Person orang_baru = new Person("Emily","Ciraden","+62812...","emily1112@person.com");
        //Inisialisasi Murid
        Student Peserta_didik_baru = new Student("Lina", "Cililin", "+62881...","Lina@student.edu", Student.tahun_kedua);
         //Inisialisasi Perusahaan
        Faculty faculty_baru = new Faculty("9am - 6pm", "Master_Pendidikan","Rebecca", "Cimindi", "+62890...", "Rebecca@fakulty.com","room 03", 13000000, new MyDate());
         //inisialisasi Staff
        Staff staff_baru = new Staff( "Asisten_Manager","Muller", "Bandung", "+62899...", "Muller@gmail.com","Room 07", 6000000, new MyDate());
        //Inisialisasi Employee
        Employee karyawan_baru = new Employee("Charles", "Cimahi", "+62833...", "Chrls@gmail.com","Room 04", 14000000, new MyDate());
        
        System.out.println("\n=====Person=====\n");
        System.out.println(orang_baru.toString() + "\n");
        System.out.println("\n=====Student=====\n");
        System.out.println(Peserta_didik_baru.toString() + "\n");
        System.out.println("\n=====Employee=====\n");
        System.out.println(karyawan_baru.toString() + "\n");
        System.out.println("\n=====Faculty=====\n");
        System.out.println(faculty_baru.toString() + "\n");
        System.out.println("\n=====Staff=====\n");
        System.out.println(staff_baru.toString() + "\n");

    }
}

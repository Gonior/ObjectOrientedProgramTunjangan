/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan35.objectorientedprogramtunjangan;
import java.util.*;
/**
 *
 * @author 
 * NAMA                 : Dedi Cahya
 * KELAS                : PBO11K
 * NIM                  : 10118901
 * Deskripsi Program    : Program menghitung tunjangan bagi karyawan yang 
 * sudah menikah dengan konsep orientasi objek
 * 
 */
public class PBO11K10118901Latihan35ObjectOrientedProgramTunjangan {
    
    public static void main(String[] args) {
        double gaji;
        String status;
        Scanner input = new Scanner(System.in);
        Tunjangan t = new Tunjangan();
        System.out.println("=============Program Tunjangan==============");
        System.out.print("Berapa gaji pokok anda perbulan   : Rp. ");
        gaji = input.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)      : " );
        status = input.next();
        t.pengecekanKaryawan(status, gaji);
        
    }
    
}

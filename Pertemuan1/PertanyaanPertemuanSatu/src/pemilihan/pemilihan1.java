/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihan;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class pemilihan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tugas, uts, uas,nilaiakhir;
        System.out.print("Masukkan nilai Tugas : ");
        tugas=sc.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        uts=sc.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        uas=sc.nextInt();
        
        if(tugas >= 0 && tugas <= 100 && uts >= 0 && uts <= 100 && uas >= 0 && uas <= 100){
            
           tugas = tugas*20/100;
           uts = uts*35/100;
           uas = uas*45/100;
           nilaiakhir=tugas+uts+uas;
           System.out.println();
           System.out.println("Nilai akhir : " + nilaiakhir);            
        }
        else {
            System.out.println();
            System.out.println("Batas Nilai yang dimasukkan harus 0-100");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramKampus;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class ProgramKampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        Kampus k1 = new Kampus();
        
        System.out.print("Jumlah Mahasiswa : ");
        k1.jumlah = sc.nextInt();
        
        Kampus[] kArray = new Kampus [k1.jumlah];
        
        for (int i=0; i<kArray.length; i++){
            kArray[i] = new Kampus();
            
            System.out.println("Mahasiswa "+ (i+1));
            System.out.print("nilai 1 : ");
            kArray[i].nilai1=sc.nextInt();
            System.out.print("nilai 2 : ");
            kArray[i].nilai2=sc.nextInt();
        }
        
        for (int i=0; i<kArray.length; i++){
            System.out.println("Nilai Terbaik Mahasiswa "+(i+1)+ " : "+k1.nilaiTerbaik(kArray[i].nilai1, kArray[i].nilai2));
        }
    }
}

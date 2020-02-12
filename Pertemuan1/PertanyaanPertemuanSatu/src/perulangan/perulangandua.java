/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class perulangandua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int saldo, bunga, totalBunga = 0;
        
        System.out.print("Masukkan saldo anda : ");
        saldo = sc.nextInt();
        
        for(int i = 1; i <= 12; i++){
            bunga = saldo * 2 / 100;
            totalBunga += bunga;
        }
        saldo = saldo - totalBunga;
        System.out.println("Saldo Keseluruhan Anda : " + saldo);  
    }
}

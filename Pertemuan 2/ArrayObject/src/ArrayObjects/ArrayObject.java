/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayObjects;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class ArrayObject {

    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[7];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<3; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke- "+i);
            System.out.print("Masukkan Panjang = ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar = ");
            ppArray[i].lebar = sc.nextInt();
        }
        for (int i=0; i<3; i++){
            System.out.println("Persegi Panjang ke- " +i);
            System.out.println("Panjang = "+ppArray[i].panjang+ ", Lebar = "+ppArray[i].lebar);
        }
    }
    
}

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
public class perulangansatu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Masukkan Suatu Angka : ");
        int A = sc.nextInt();

        for (i = 1; i <= 5; i++) {
            System.out.print("Pengurangan ke-" + i + " ( " + A + " - 3 ) = ");
            A = A - 3;
            System.out.println(A);
        }
        if (A % 2 == 0) {
            System.out.println(A + " Adalah Bilangan Genap");
        } else {
            System.out.println(A + " Adalah Bilangan Ganjil");
        }
    }
}

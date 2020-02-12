/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class arraydua {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Array1 = new int[4][5];
        int total = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan elemen array ke-[" + i + "][" + j + "] ");
                Array1[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Array1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                total += Array1[i][j];
            }
        }
        System.out.println("Total keseluruhan isi Array : " + total);
    }
}

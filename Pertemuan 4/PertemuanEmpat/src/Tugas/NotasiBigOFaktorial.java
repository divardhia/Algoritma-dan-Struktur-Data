/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author diva ardhia
 */
public class NotasiBigOFaktorial {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1; //O(1)
        int i =1; //O(1)
        while (i <= n) { //O(n)
            fakto = fakto * i; //O(1)
            i++; //O(1)
        }
        return fakto; //O(1)
    }

    public int faktorialDC(int n) {
        if (n == 1) { //O(1)
            return 1; //O(1)
        } else {
            int fakto = n * faktorialDC(n - 1); //O(1)
            return fakto; //O(1)
        }
        //1+1+n*1*1+1+1+1+1+1 = 2+n+5 = 7+n = O(n)
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //O(1)
        System.out.println(); //O(1)
        System.out.print("Masukkan Jumlah Elemen yang ingin dihitung : "); //O(1)
        int elemen = sc.nextInt(); //O(1)

        NotasiBigOFaktorial[] fk = new NotasiBigOFaktorial[elemen]; //O(1)
        for (int i = 0; i < elemen; i++) { //O(n)
            fk[i] = new NotasiBigOFaktorial(); //O(1)
            System.out.print("Masukkan nilai data ke- " + (i + 1) + " : "); //O(1)
            fk[i].nilai = sc.nextInt(); //O(1)

        }
        System.out.println(); //O(1)
        System.out.println("Hasil Faktorial dari Brute Force"); //O(1)
        for (int i = 0; i < elemen; i++) { //O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialBF(fk[i].nilai)); //O(1)
        }
        System.out.println(); //O(1)
        System.out.println("Hasil Faktorial dari Divide and Conquer"); //O(1)
        for (int i = 0; i < elemen; i++) { //O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialDC(fk[i].nilai)); //O(1)
        }
    }
    //1+1+1+1+1+n*1*1*1*1+1+1+n*1+1+1+n*1 = 5+n+3+n+2+n = 10 + 3n = 3n = O(n)
}


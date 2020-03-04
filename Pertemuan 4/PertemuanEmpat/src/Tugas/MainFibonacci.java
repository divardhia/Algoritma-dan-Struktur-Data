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
public class MainFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //O(1)
        
        TugasDuaFibonacci f = new TugasDuaFibonacci(); //O(1)
        
        System.out.print("Masukkan range nilai n : "); //O(1)
        int n = sc.nextInt(); //O(1)
        
        System.out.println(); //O(1)
        System.out.println("Fibonacci Brute Force"); //O(1)
        for (int i = 0; i<n; i++){ //O(n)
            System.out.println("Hasil Bilangan Fibonacci "+f.FibonacciBF(i)); //O(1)
        }
        System.out.println();//O(1)
        System.out.println("Fibonacci Divide Conquer"); //O(1)
        for (int i = 0; i<n; i++){ //O(n)
            System.out.println("Hasil Bilangan Fibonacci "+f.FibonacciDC(i));//O(1)
        }
    }
    // 1+1+1+1+1+1+n*1+1+1+n*1 = 6+n+2+n = 8+2n = 2n = O(n)
}

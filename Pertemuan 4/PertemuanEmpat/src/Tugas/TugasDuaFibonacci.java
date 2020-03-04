/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author diva ardhia
 */
public class TugasDuaFibonacci {
    public long FibonacciBF(long n){
        long a[];  //O(1)
        a = new long [(int) n +2]; //O(1)
        a[0] = 0; //O(1)
        a[1] = 1; //O(1)
        for (int i = 2; i<=n; i++){ //O(N)
            a[i] = a [i-1] + a [i - 2]; //O(1)
        }
        return a[(int) n]; //O(1)
    }
    
    public long FibonacciDC(long n){
        if (n<=1){ //O(1)
            return n; //O(1)
        }
        else{
            return FibonacciDC(n - 1) + FibonacciDC(n - 2); //O(1)
        }
    }
    // 1+1+1+1+N*1+1+1+1+1 = 4 + n + 4 = O(n)
}

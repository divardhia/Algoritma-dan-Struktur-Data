/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

/**
 *
 * @author ASUS X441MA
 */
public class fungsiB {
    static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }
    
    public static void main(String[] args){
        int i, j = 0, a = 0;
        int n = 9;
        System.out.print("Fibonacci : ");
        for( i = 0; i < n; i++){
            System.out.print(fibonacci(j) + " ");
            j++;
        }
    }
}

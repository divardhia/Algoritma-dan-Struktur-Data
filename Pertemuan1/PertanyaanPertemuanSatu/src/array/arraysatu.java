/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ASUS X441MA
 */
public class arraysatu {
    public static void main(String[] args) {
        int [] angka = {3, 5, 7, 8, 9, 225, 45, 10, 198, 20, 25, 99, 88, 11, 366, 74};
        System.out.print("Bilangan Genap = ");
        for (int i=0; i < angka.length; i++){
            if (angka [i] % 2 ==0){
                System.out.print(" "+angka[i]);
            }
        }
        System.out.println();
        System.out.print("Bilangan Ganjil = ");
        for (int i=0; i < angka.length; i++){
            if (angka [i] % 2 !=0){
                System.out.print(" "+ angka[i]);
            }
        }
    }
}

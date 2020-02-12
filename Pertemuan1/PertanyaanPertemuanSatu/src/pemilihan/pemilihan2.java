/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihan;
import java.util.Scanner;
/**
 *
 * @author ASUS X441MA
 */
public class pemilihan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int y=sc.nextInt();
        if (y % 2 ==0 && y % 6 != 0 && y % 15 !=0){
            System.out.println("Bilangan "+y+ " Adalah Kelipatan 2");
        }
        else if ( y % 6 ==0 && y % 15 !=0){
            System.out.println("Bilangan "+y+ " Adalah Kelipatan 6");
        }
        else if (y % 15 == 0){
            System.out.println("Bilangan "+y+ " Adalah Kelipatan 15");
        }
        else {
            System.out.println("Bilangan yang diinputkan bukan kelipatan 2,6,ataupun 15");
        }
    }
}

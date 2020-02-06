/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslima;
import java.util.Scanner;
/**
 *
 * @author ASUS X441MA
 */
public class fungsi {
    static void LuasSegitiga(){
        Scanner sc=new Scanner(System.in);
        System.out.println("===== Luas Segitiga ======");
        System.out.print("Masukkan Alas Segitiga : ");
        int a = sc.nextInt();
        System.out.print("Masukkan Tinggi Segitiga : ");
        int t = sc.nextInt();
        double Lsegitiga = a*t/2;
        System.out.println("Luas Segitiga adalah " +Lsegitiga);
        System.out.println();
    }
    static void luasSegiempat(){
        Scanner sc=new Scanner (System.in);
        System.out.println("===== Luas Segiempat ======");
        System.out.print("Masukkan sisi : ");
        int sisi= sc.nextInt();
        double Lsegiempat= sisi*sisi;
        System.out.println("Luas Segiempat Adalah " +Lsegiempat);
        System.out.println();
    }
    static void LuasLingkaran(){
        Scanner sc=new Scanner (System.in);
        System.out.println("===== Luas Lingkaran ======");
        System.out.print("Masukkan jari-jari lingkaran : ");
        int r=sc.nextInt();
        double phi = 3.14;
        double Llingkaran= phi*r*r;
        System.out.println("Luas Lingkaran Adalah " +Llingkaran);
        System.out.println();
    }
    static void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("=== Pilihan Menu Bangun yang dihitung ===");
        System.out.println(" 1. Luas Segitiga");
        System.out.println(" 2. Luas Segiempat");
        System.out.println(" 3. Luas Lingkaran");
        System.out.print("Pilih Menu : ");
        int menu = sc.nextInt();
        switch (menu){
            case 1 :
                LuasSegitiga();
                break;
            case 2 :
                luasSegiempat();
                break;
            case 3 :
                LuasLingkaran();
        }
    }
    public static void main(String[] args) {
        menu();
    }
}

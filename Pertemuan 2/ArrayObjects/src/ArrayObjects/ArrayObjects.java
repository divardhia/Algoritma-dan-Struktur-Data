/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayObjects;

/**
 *
 * @author ASUS X441MA
 */
public class ArrayObjects {

    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;
        
        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
        
        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;
        
        System.out.println("Persegi Panjang ke-0, Panjang = "+ppArray[0].panjang+ ", Lebar = "+ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, Panjang = "+ppArray[1].panjang+ ", Lebar = "+ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, Panjang = "+ppArray[2].panjang+ ", Lebar = "+ppArray[2].lebar);
    }
    
}

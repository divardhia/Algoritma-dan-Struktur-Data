/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramTanah;

/**
 *
 * @author ASUS X441MA
 */
public class Tanah {
    public int jumlah;
    public int panjang;
    public int lebar;
    public int max;
    public int x;
    
    public int hitungLuas(){
        return panjang*lebar;
    }

    int hitungLuas(int p, int l) {
        return p*l;
    }
}
